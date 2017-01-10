package com.ut.cafe.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ut.vo.Tipocafe;
import com.ut.cafe.dao.ITipocafeDao;

import org.springframework.stereotype.Repository;

/**
 * The DAO class for the Tipocafe entity.
 */
@Repository(value="tipocafeDao")
public class TipocafeDaoImpl implements ITipocafeDao {
    @PersistenceContext
    private EntityManager em;

	public TipocafeDaoImpl() {
		super();
	}
	/**
	 * Return the persistent entities returned from a named query.
	 */
	@SuppressWarnings("unchecked")
	public List<Tipocafe> findByNamedQuery(String queryName) {
		Query queryObject = em.createNamedQuery(queryName);
		return queryObject.getResultList();
	}
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	@SuppressWarnings("unchecked")
	public List<Tipocafe> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues) {
		if (paramNames.length != paramValues.length) {
			throw new IllegalArgumentException();
		}
		Map<String, Object> params = new java.util.HashMap<String, Object>(paramNames.length);
		for (int i = 0; i < paramNames.length; ++i) {
			params.put(paramNames[i], paramValues[i]);
		}
		
		Query queryObject = em.createNamedQuery(queryName);
		if (params != null) {
			for (Map.Entry<String, ?> entry : params.entrySet()) {
				queryObject.setParameter(entry.getKey(), entry.getValue());
			}
		}
		return queryObject.getResultList();

	}
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Tipocafe findTipocafeById(java.lang.Long id) {
		return (Tipocafe)em.find(Tipocafe.class, id);
	}
	/**
	 * Return all persistent instances of the <code>Tipocafe</code> entity.
	 */
	@SuppressWarnings("unchecked")
	public List<Tipocafe> findAllTipocafes() {
        try {
    		String jpqlString = "select tipocafe from " + Tipocafe.class.getSimpleName() + " tipocafe";
            Query query = em.createQuery( jpqlString );
            return query.getResultList();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistTipocafe(Tipocafe tipocafe) {
		em.persist(em.merge(tipocafe));
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeTipocafe(Tipocafe tipocafe) {
		/*In JPA, objects detach automatically when they are serialized or when a persistence context ends.
		 The merge method returns a managed copy of the given detached entity.*/
		em.remove(em.merge(tipocafe));
	}
}