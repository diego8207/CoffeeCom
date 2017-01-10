package com.ut.cafe.dao;

import java.util.List;

import com.ut.vo.Finca;

/**
 * The DAO interface for the Finca entity.
 */
public interface IFincaDao {
	/**
	 * Return the persistent entities returned from a named query.
	 */
	
	public List<Finca> findByNamedQuery(String queryName);
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	
	public List<Finca> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues);
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Finca findFincaById(java.lang.String id);
	/**
	 * Return all persistent instances of the <code>Finca</code> entity.
	 */
	public List<Finca> findAllFincas();
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistFinca(Finca finca);
	/**
	 * Remove the given persistent instance.
	 */
	public void removeFinca(Finca finca);
}