package com.ut.cafe.dao;

import java.util.List;

import com.ut.vo.Lote;

/**
 * The DAO interface for the Lote entity.
 */
public interface ILoteDao {
	/**
	 * Return the persistent entities returned from a named query.
	 */
	
	public List<Lote> findByNamedQuery(String queryName);
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	
	public List<Lote> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues);
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Lote findLoteById(java.lang.String id);
	/**
	 * Return all persistent instances of the <code>Lote</code> entity.
	 */
	public List<Lote> findAllLotes();
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistLote(Lote lote);
	/**
	 * Remove the given persistent instance.
	 */
	public void removeLote(Lote lote);
}