package com.ut.cafe.dao;

import java.util.List;

import com.ut.vo.Tipocafe;

/**
 * The DAO interface for the Tipocafe entity.
 */
public interface ITipocafeDao {
	/**
	 * Return the persistent entities returned from a named query.
	 */
	
	public List<Tipocafe> findByNamedQuery(String queryName);
	/**
	 * Return the persistent entities returned from a named query with named parameters.
	 */
	
	public List<Tipocafe> findByNamedQuery(String queryName, String[] paramNames, Object[] paramValues);
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Tipocafe findTipocafeById(java.lang.Long id);
	/**
	 * Return all persistent instances of the <code>Tipocafe</code> entity.
	 */
	public List<Tipocafe> findAllTipocafes();
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistTipocafe(Tipocafe tipocafe);
	/**
	 * Remove the given persistent instance.
	 */
	public void removeTipocafe(Tipocafe tipocafe);
}