package com.ut.cafe.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ut.vo.Finca;
import com.ut.cafe.dao.IFincaDao;

import org.springframework.stereotype.Repository;

/**
 * The DAO class for the Finca entity.
 */
@Repository(value="fincaDao")
public class FincaDaoImpl implements IFincaDao {
    @PersistenceContext
    private EntityManager em;

	public FincaDaoImpl() {
		super();
	}
	/**
	 * Return the persistent entities returned from a named query.
	 */
	@SuppressWarnings("unchecked")
	public List<Finca> findByNamedQuery(String queryName) {
		Query queryObject = em.createNamedQuery(queryName);
		return queryObject.getResultList();
	}
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	@SuppressWarnings("unchecked")
	public List<Finca> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues) {
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
	public Finca findFincaById(java.lang.String id) {
		return (Finca)em.find(Finca.class, id);
	}
	/**
	 * Return all persistent instances of the <code>Finca</code> entity.
	 */
	@SuppressWarnings("unchecked")
	public List<Finca> findAllFincas() {
        try {
    		String jpqlString = "select finca from " + Finca.class.getSimpleName() + " finca";
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
	public void persistFinca(Finca finca) {
		em.persist(em.merge(finca));
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeFinca(Finca finca) {
		/*In JPA, objects detach automatically when they are serialized or when a persistence context ends.
		 The merge method returns a managed copy of the given detached entity.*/
		em.remove(em.merge(finca));
	}
}