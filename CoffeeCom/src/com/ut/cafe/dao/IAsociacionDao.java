package com.ut.cafe.dao;

import java.util.List;

import com.ut.vo.Asociacion;

/**
 * The DAO interface for the Asociacion entity.
 */
public interface IAsociacionDao {
	/**
	 * Return the persistent entities returned from a named query.
	 */
	
	public List<Asociacion> findByNamedQuery(String queryName);
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	
	public List<Asociacion> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues);
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Asociacion findAsociacionById(java.lang.String id);
	/**
	 * Return all persistent instances of the <code>Asociacion</code> entity.
	 */
	public List<Asociacion> findAllAsociacions();
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistAsociacion(Asociacion asociacion);
	/**
	 * Remove the given persistent instance.
	 */
	public void removeAsociacion(Asociacion asociacion);
}