package com.ut.cafe.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ut.vo.Lote;
import com.ut.cafe.dao.ILoteDao;

import org.springframework.stereotype.Repository;

/**
 * The DAO class for the Lote entity.
 */
@Repository(value="loteDao")
public class LoteDaoImpl implements ILoteDao {
    @PersistenceContext
    private EntityManager em;

	public LoteDaoImpl() {
		super();
	}
	/**
	 * Return the persistent entities returned from a named query.
	 */
	@SuppressWarnings("unchecked")
	public List<Lote> findByNamedQuery(String queryName) {
		Query queryObject = em.createNamedQuery(queryName);
		return queryObject.getResultList();
	}
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	@SuppressWarnings("unchecked")
	public List<Lote> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues) {
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
	public Lote findLoteById(java.lang.String id) {
		return (Lote)em.find(Lote.class, id);
	}
	/**
	 * Return all persistent instances of the <code>Lote</code> entity.
	 */
	@SuppressWarnings("unchecked")
	public List<Lote> findAllLotes() {
        try {
    		String jpqlString = "select lote from " + Lote.class.getSimpleName() + " lote";
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
	public void persistLote(Lote lote) {
		em.persist(em.merge(lote));
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeLote(Lote lote) {
		/*In JPA, objects detach automatically when they are serialized or when a persistence context ends.
		 The merge method returns a managed copy of the given detached entity.*/
		em.remove(em.merge(lote));
	}
}