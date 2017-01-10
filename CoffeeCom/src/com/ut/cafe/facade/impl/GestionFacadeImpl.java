package com.ut.cafe.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.cafe.dao.IAsociacionDao;
import com.ut.cafe.dao.ICaficultorDao;
import com.ut.cafe.dao.IFincaDao;
import com.ut.cafe.dao.ILoteDao;
import com.ut.cafe.dao.ITipocafeDao;
import com.ut.cafe.facade.IGestionFacade;
import com.ut.vo.Asociacion;
import com.ut.vo.Caficultor;
import com.ut.vo.Finca;
import com.ut.vo.Lote;
import com.ut.vo.Tipocafe;

public class GestionFacadeImpl implements IGestionFacade{
	
	@Autowired
	IAsociacionDao asociacionDao;
	
	@Autowired
	ICaficultorDao caficultorDao;
	
	@Autowired
	IFincaDao fincaDao;
	
	@Autowired
	ILoteDao loteDao;
	
	@Autowired
	ITipocafeDao tipocafeDao;
	
//	ASOCIACION
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public Asociacion findAsociacionById(java.lang.String id) throws Exception {
		try {
			return getAsociacionDao().findAsociacionById(id);
		} catch (RuntimeException e) {
			throw new Exception("findAsociacionById failed with the id " + id + ": " + e.getMessage());
		}
	}
	/**
	 * Return all persistent instances of the <code>Asociacion</code> entity.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public List<Asociacion> findAllAsociacions() throws Exception {
		try {
			return getAsociacionDao().findAllAsociacions();
		} catch (RuntimeException e) {
			throw new Exception("findAllAsociacions failed: " + e.getMessage());
		}
	}

	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistAsociacion(Asociacion asociacion) throws Exception {
		try {
			getAsociacionDao().persistAsociacion(asociacion);
		} catch (RuntimeException e) {
			throw new Exception("persistAsociacion failed: " + e.getMessage());
		}
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeAsociacion(Asociacion asociacion) throws Exception {
		try {
			getAsociacionDao().removeAsociacion(asociacion);
		} catch (RuntimeException e) {
			throw new Exception("removeAsociacion failed: " + e.getMessage());
		}
	}
	
//	CAFICULTOR
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public Caficultor findCaficultorById(java.lang.String id) throws Exception {
		try {
			return getCaficultorDao().findCaficultorById(id);
		} catch (RuntimeException e) {
			throw new Exception("findCaficultorById failed with the id " + id + ": " + e.getMessage());
		}
	}
	/**
	 * Return all persistent instances of the <code>Caficultor</code> entity.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public List<Caficultor> findAllCaficultors() throws Exception {
		try {
			return getCaficultorDao().findAllCaficultors();
		} catch (RuntimeException e) {
			throw new Exception("findAllCaficultors failed: " + e.getMessage());
		}
	}

	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistCaficultor(Caficultor caficultor) throws Exception {
		try {
			getCaficultorDao().persistCaficultor(caficultor);
		} catch (RuntimeException e) {
			throw new Exception("persistCaficultor failed: " + e.getMessage());
		}
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeCaficultor(Caficultor caficultor) throws Exception {
		try {
			getCaficultorDao().removeCaficultor(caficultor);
		} catch (RuntimeException e) {
			throw new Exception("removeCaficultor failed: " + e.getMessage());
		}
	}
	
//	FINCA
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public Finca findFincaById(java.lang.String id) throws Exception {
		try {
			return getFincaDao().findFincaById(id);
		} catch (RuntimeException e) {
			throw new Exception("findFincaById failed with the id " + id + ": " + e.getMessage());
		}
	}
	/**
	 * Return all persistent instances of the <code>Finca</code> entity.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public List<Finca> findAllFincas() throws Exception {
		try {
			return getFincaDao().findAllFincas();
		} catch (RuntimeException e) {
			throw new Exception("findAllFincas failed: " + e.getMessage());
		}
	}

	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistFinca(Finca finca) throws Exception {
		try {
			getFincaDao().persistFinca(finca);
		} catch (RuntimeException e) {
			throw new Exception("persistFinca failed: " + e.getMessage());
		}
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeFinca(Finca finca) throws Exception {
		try {
			getFincaDao().removeFinca(finca);
		} catch (RuntimeException e) {
			throw new Exception("removeFinca failed: " + e.getMessage());
		}
	}
	
//	LOTE
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public Lote findLoteById(java.lang.String id) throws Exception {
		try {
			return getLoteDao().findLoteById(id);
		} catch (RuntimeException e) {
			throw new Exception("findLoteById failed with the id " + id + ": " + e.getMessage());
		}
	}
	/**
	 * Return all persistent instances of the <code>Lote</code> entity.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public List<Lote> findAllLotes() throws Exception {
		try {
			return getLoteDao().findAllLotes();
		} catch (RuntimeException e) {
			throw new Exception("findAllLotes failed: " + e.getMessage());
		}
	}

	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistLote(Lote lote) throws Exception {
		try {
			getLoteDao().persistLote(lote);
		} catch (RuntimeException e) {
			throw new Exception("persistLote failed: " + e.getMessage());
		}
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeLote(Lote lote) throws Exception {
		try {
			getLoteDao().removeLote(lote);
		} catch (RuntimeException e) {
			throw new Exception("removeLote failed: " + e.getMessage());
		}
	}
	
//	TIPOCAFE
	/**
	 * Find an entity by its id (primary key).
	 * @return The found entity instance or null if the entity does not exist.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public Tipocafe findTipocafeById(java.lang.Long id) throws Exception {
		try {
			return getTipocafeDao().findTipocafeById(id);
		} catch (RuntimeException e) {
			throw new Exception("findTipocafeById failed with the id " + id + ": " + e.getMessage());
		}
	}
	/**
	 * Return all persistent instances of the <code>Tipocafe</code> entity.
	 */
	@Transactional(propagation=Propagation.NEVER, readOnly=true)
	public List<Tipocafe> findAllTipocafes() throws Exception {
		try {
			return getTipocafeDao().findAllTipocafes();
		} catch (RuntimeException e) {
			throw new Exception("findAllTipocafes failed: " + e.getMessage());
		}
	}

	/**
	 * Make the given instance managed and persistent.
	 */
	public void persistTipocafe(Tipocafe tipocafe) throws Exception {
		try {
			getTipocafeDao().persistTipocafe(tipocafe);
		} catch (RuntimeException e) {
			throw new Exception("persistTipocafe failed: " + e.getMessage());
		}
	}
	/**
	 * Remove the given persistent instance.
	 */
	public void removeTipocafe(Tipocafe tipocafe) throws Exception {
		try {
			getTipocafeDao().removeTipocafe(tipocafe);
		} catch (RuntimeException e) {
			throw new Exception("removeTipocafe failed: " + e.getMessage());
		}
	}

	
	public ICaficultorDao getCaficultorDao() {
		return caficultorDao;
	}
	public void setCaficultorDao(ICaficultorDao caficultorDao) {
		this.caficultorDao = caficultorDao;
	}
	public IFincaDao getFincaDao() {
		return fincaDao;
	}
	public void setFincaDao(IFincaDao fincaDao) {
		this.fincaDao = fincaDao;
	}
	public ILoteDao getLoteDao() {
		return loteDao;
	}
	public void setLoteDao(ILoteDao loteDao) {
		this.loteDao = loteDao;
	}
	public ITipocafeDao getTipocafeDao() {
		return tipocafeDao;
	}
	public void setTipocafeDao(ITipocafeDao tipocafeDao) {
		this.tipocafeDao = tipocafeDao;
	}
	public IAsociacionDao getAsociacionDao() {
		return asociacionDao;
	}
	public void setAsociacionDao(IAsociacionDao asociacionDao) {
		this.asociacionDao = asociacionDao;
	}
	
	
	
}
