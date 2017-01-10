package com.ut.cafe.facade;

import java.util.List;

import com.ut.vo.Asociacion;
import com.ut.vo.Caficultor;
import com.ut.vo.Finca;
import com.ut.vo.Lote;
import com.ut.vo.Tipocafe;

public interface IGestionFacade {
//	ASOCIACION
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Asociacion findAsociacionById(java.lang.String id) throws Exception;
	/**
	 * Return all persistent instances of the <code>Asociacion</code> entity.
	 */
	public List<Asociacion> findAllAsociacions() throws Exception;
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistAsociacion(Asociacion asociacion) throws Exception;
	/**
	 * Remove the given persistent instance.
	 */
	public void removeAsociacion(Asociacion asociacion) throws Exception;
	/**
	 * Service method for named queries
	 */
	
//	CAFICULTOR
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Caficultor findCaficultorById(java.lang.String id) throws Exception;
	/**
	 * Return all persistent instances of the <code>Caficultor</code> entity.
	 */
	public List<Caficultor> findAllCaficultors() throws Exception;
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistCaficultor(Caficultor caficultor) throws Exception;
	/**
	 * Remove the given persistent instance.
	 */
	public void removeCaficultor(Caficultor caficultor) throws Exception;
	
//	FINCA
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Finca findFincaById(java.lang.String id) throws Exception;
	/**
	 * Return all persistent instances of the <code>Finca</code> entity.
	 */
	public List<Finca> findAllFincas() throws Exception;
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistFinca(Finca finca) throws Exception;
	/**
	 * Remove the given persistent instance.
	 */
	public void removeFinca(Finca finca) throws Exception;
	
//	LOTE
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Lote findLoteById(java.lang.String id) throws Exception;
	/**
	 * Return all persistent instances of the <code>Lote</code> entity.
	 */
	public List<Lote> findAllLotes() throws Exception;
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistLote(Lote lote) throws Exception;
	/**
	 * Remove the given persistent instance.
	 */
	public void removeLote(Lote lote) throws Exception;
	
//	TIPOCAFE
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	public Tipocafe findTipocafeById(java.lang.Long id) throws Exception;
	/**
	 * Return all persistent instances of the <code>Tipocafe</code> entity.
	 */
	public List<Tipocafe> findAllTipocafes() throws Exception;
	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistTipocafe(Tipocafe tipocafe) throws Exception;
	/**
	 * Remove the given persistent instance.
	 */
	public void removeTipocafe(Tipocafe tipocafe) throws Exception;
}
