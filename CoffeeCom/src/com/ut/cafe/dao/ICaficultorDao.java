package com.ut.cafe.dao;

import java.util.List;

import com.ut.vo.Caficultor;

/**
 * The DAO interface for the Caficultor entity.
 */
public interface ICaficultorDao {
	/**
	 * Return the persistent entities returned from a named query.
	 */
	
	public List<Caficultor> findByNamedQuery(String queryName);
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	
	public List<Caficultor> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues);
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Caficultor findCaficultorById(java.lang.String id);
	/**
	 * Return all persistent instances of the <code>Caficultor</code> entity.
	 */
	public List<Caficultor> findAllCaficultors();
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistCaficultor(Caficultor caficultor);
	/**
	 * Remove the given persistent instance.
	 */
	public void removeCaficultor(Caficultor caficultor);
}