package com.ut.cafe.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ut.vo.Caficultor;
import com.ut.cafe.dao.ICaficultorDao;

import org.springframework.stereotype.Repository;

/**
 * The DAO class for the Caficultor entity.
 */
@Repository(value="caficultorDao")
public class CaficultorDaoImpl implements ICaficultorDao {
    @PersistenceContext
    private EntityManager em;

	public CaficultorDaoImpl() {
		super();
	}
	/**
	 * Return the persistent entities returned from a named query.
	 */
	@SuppressWarnings("unchecked")
	public List<Caficultor> findByNamedQuery(String queryName) {
		Query queryObject = em.createNamedQuery(queryName);
		return queryObject.getResultList();
	}
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	@SuppressWarnings("unchecked")
	public List<Caficultor> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues) {
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
	public Caficultor findCaficultorById(java.lang.String id) {
		return (Caficultor)em.find(Caficultor.class, id);
	}
	/**
	 * Return all persistent instances of the <code>Caficultor</code> entity.
	 */
	@SuppressWarnings("unchecked")
	public List<Caficultor> findAllCaficultors() {
        try {
    		String jpqlString = "select caficultor from " + Caficultor.class.getSimpleName() + " caficultor";
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
	public void persistCaficultor(Caficultor caficultor) {
		em.persist(em.merge(caficultor));
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeCaficultor(Caficultor caficultor) {
		/*In JPA, objects detach automatically when they are serialized or when a persistence context ends.
		 The merge method returns a managed copy of the given detached entity.*/
		em.remove(em.merge(caficultor));
	}
}