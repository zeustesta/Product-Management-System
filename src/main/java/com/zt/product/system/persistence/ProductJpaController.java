package com.zt.product.system.persistence;

import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
import com.zt.product.system.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

public class ProductJpaController implements Serializable{
    
    private EntityManagerFactory emf = null;
    
    public ProductJpaController () {
        this.emf = Persistence.createEntityManagerFactory("elmagoPU");
    }

    public ProductJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Product product) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(product);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Product product) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            product = em.merge(product);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                if (findProductModel(product.getProductId()) == null) {
                    throw new NonexistentEntityException("El producto con ID: " + product.getProductId() + " no fue encontrado.");   
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Product product;
            try {
                product = em.getReference(Product.class, id);
                product.getProductId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El producto con ID: " + id + " no fue encontrado.", enfe);
            }
            em.remove(product);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Product findProductModel(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Product.class, id);
        } finally {
            em.close();
        }
    }

    public List<Product> findProductModelEntities() {
        return findProductModelEntities(true, -1, -1);
    }

    public List<Product> findProductModelEntities(int maxResults, int firstResult) {
        return findProductModelEntities(false, maxResults, firstResult);
    }

    private List<Product> findProductModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Product.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public int getProductModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Product> rt = cq.from(Product.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public void modifyPrices(String operation, String type, String typeSelection, int percent) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Product> cq = cb.createQuery(Product.class);
            Root<Product> product = cq.from(Product.class);

            Predicate predicate;
            if ("Marca".equalsIgnoreCase(type)) {
                predicate = cb.equal(product.get("brand").get("brandName"), typeSelection);
            } else if ("Proveedor".equalsIgnoreCase(type)) {
                Subquery<Long> subquery = cq.subquery(Long.class);
                Root<Product> subProduct = subquery.from(Product.class);
                subquery.select(subProduct.get("productId"))
                        .where(cb.equal(subProduct.join("suppliers").get("supplierName"), typeSelection));
                predicate = product.get("productId").in(subquery);
            } else {
                throw new IllegalArgumentException("Tipo no válido");
            }

            cq.select(product).where(predicate);
            List<Product> products = em.createQuery(cq).getResultList();

            for (Product p : products) {
                if ("Incremento".equalsIgnoreCase(operation)) {
                    p.setProductPrice((float) (p.getProductPrice() * (1 + (percent / 100.0))));
                } else if ("Decremento".equalsIgnoreCase(operation)) {
                    p.setProductPrice((float) (p.getProductPrice() * (1 - (percent / 100.0))));
                } else {
                    throw new IllegalArgumentException("Operación no válida");
                }
                em.merge(p);
            }

            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    
    }
}

