package com.ut.cafe.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ut.vo.Asociacion;
import com.ut.cafe.dao.IAsociacionDao;

import org.springframework.stereotype.Repository;

/**
 * The DAO class for the Asociacion entity.
 */
@Repository(value="asociacionDao")
public class AsociacionDaoImpl implements IAsociacionDao {
    @PersistenceContext
    private EntityManager em;

	public AsociacionDaoImpl() {
		super();
	}
	/**
	 * Return the persistent entities returned from a named query.
	 */
	@SuppressWarnings("unchecked")
	public List<Asociacion> findByNamedQuery(String queryName) {
		Query queryObject = em.createNamedQuery(queryName);
		return queryObject.getResultList();
	}
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	@SuppressWarnings("unchecked")
	public List<Asociacion> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues) {
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
	public Asociacion findAsociacionById(java.lang.String id) {
		return (Asociacion)em.find(Asociacion.class, id);
	}
	/**
	 * Return all persistent instances of the <code>Asociacion</code> entity.
	 */
	@SuppressWarnings("unchecked")
	public List<Asociacion> findAllAsociacions() {
        try {
    		String jpqlString = "select asociacion from " + Asociacion.class.getSimpleName() + " asociacion";
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
	public void persistAsociacion(Asociacion asociacion) {
		em.persist(em.merge(asociacion));
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeAsociacion(Asociacion asociacion) {
		/*In JPA, objects detach automatically when they are serialized or when a persistence context ends.
		 The merge method returns a managed copy of the given detached entity.*/
		em.remove(em.merge(asociacion));
	}
}