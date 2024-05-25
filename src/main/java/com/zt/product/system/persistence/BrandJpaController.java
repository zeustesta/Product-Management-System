package com.zt.product.system.persistence;

import com.zt.product.system.model.Brand;
import com.zt.product.system.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class BrandJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    public BrandJpaController () {
        this.emf = Persistence.createEntityManagerFactory("elmagoPU");
    }

    public BrandJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Brand brand) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(brand);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                if (findBrand(brand.getBrandId()) == null) {
                    throw new NonexistentEntityException("La marca con ID: " + brand.getBrandId() + " no fue encontrada.");   
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Brand brand) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            brand = em.merge(brand);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findBrand(brand.getBrandId()) == null) {
                throw new Exception("La marca con ID: " + brand.getBrandId() + " no fue encontrada.", ex);
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
            Brand brand;
            try {
                brand = em.getReference(Brand.class, id);
                brand.getBrandId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("La marca con ID: " + id + " no fue encontrada", enfe);
            }
            em.remove(brand);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Brand findBrand(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Brand.class, id);
        } finally {
            em.close();
        }
    }
    
    public Brand findBrandByName(String brandName) {
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery(Brand.class);
            Root<Brand> brandRoot = cq.from(Brand.class);
            
            if (brandName != null) {
                cq.where(em.getCriteriaBuilder().equal(brandRoot.get("brandName"), brandName));
            }
            
            TypedQuery<Brand> queryResult = em.createQuery(cq);
            
            return queryResult.getSingleResult();
        } finally {
            em.close();
        }
    }

    public List<Brand> findBrandEntities() {
        return findBrandEntities(true, -1, -1);
    }

    public List<Brand> findBrandEntities(int maxResults, int firstResult) {
        return findBrandEntities(false, maxResults, firstResult);
    }

    private List<Brand> findBrandEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Brand.class));
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

    public int getBrandCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Brand> rt = cq.from(Brand.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
