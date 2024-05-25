package com.zt.product.system.persistence;

import com.zt.product.system.model.Supplier;
import com.zt.product.system.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;

import javax.persistence.*;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class SupplierJpaController implements Serializable{

    private EntityManagerFactory emf = null;
    
    public SupplierJpaController () {
        this.emf = Persistence.createEntityManagerFactory("elmagoPU");
    }

    public SupplierJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Supplier supplier) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(supplier);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSupplier(supplier.getSupplierId()) != null) {
                throw new Exception("El proveedor: " + supplier.getSupplierName() + " ya existe.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Supplier supplier) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            supplier = em.merge(supplier);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                if (findSupplier(supplier.getSupplierId()) == null) {
                    throw new NonexistentEntityException("El proveedor con ID: " + supplier.getSupplierId() + " no fue encontrado.");   
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
            Supplier supplier;
            try {
                supplier = em.getReference(Supplier.class, id);
                supplier.getSupplierId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("El proveedor con ID: " + id + " no fue encontrado.", enfe);
            }
            em.remove(supplier);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Supplier findSupplier(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Supplier.class, id);
        } finally {
            em.close();
        }
    }
    
    public Supplier findSupplierByName(String supplierName) {
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery(Supplier.class);
            Root<Supplier> supplierRoot = cq.from(Supplier.class);
            
            if (supplierName != null) {
                cq.where(em.getCriteriaBuilder().equal(supplierRoot.get("supplierName"), supplierName));
            }
            
            TypedQuery<Supplier> queryResult = em.createQuery(cq);
            
            return queryResult.getSingleResult();
        } finally {
            em.close();
        }
    }

    public List<Supplier> findSupplierEntities() {
        return findSupplierEntities(true, -1, -1);
    }

    public List<Supplier> findSupplierEntities(int maxResults, int firstResult) {
        return findSupplierEntities(false, maxResults, firstResult);
    }

    private List<Supplier> findSupplierEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Supplier.class));
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

    public int getSupplierCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Supplier> rt = cq.from(Supplier.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}

