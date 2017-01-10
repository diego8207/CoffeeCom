package com.ut.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOTES database table.
 * 
 */
@Entity
@Table(name="LOTES")
@NamedQuery(name="Lote.findAll", query="SELECT l FROM Lote l")
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=30)
	private String idlote;

	@Column(nullable=false)
	private BigDecimal cantplantas;

	@Column(nullable=false, length=30)
	private String estado;

	@Column(name="FECHA_DISPON", length=30)
	private String fechaDispon;

	@Column(nullable=false)
	private BigDecimal hectareas;

	//bi-directional many-to-one association to Finca
	@ManyToOne
	@JoinColumn(name="IDFINCA")
	private Finca finca;

	//bi-directional many-to-one association to Tipocafe
	@ManyToOne
	@JoinColumn(name="CODIGO")
	private Tipocafe tipocafe;

	public Lote() {
	}

	public String getIdlote() {
		return this.idlote;
	}

	public void setIdlote(String idlote) {
		this.idlote = idlote;
	}

	public BigDecimal getCantplantas() {
		return this.cantplantas;
	}

	public void setCantplantas(BigDecimal cantplantas) {
		this.cantplantas = cantplantas;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaDispon() {
		return this.fechaDispon;
	}

	public void setFechaDispon(String fechaDispon) {
		this.fechaDispon = fechaDispon;
	}

	public BigDecimal getHectareas() {
		return this.hectareas;
	}

	public void setHectareas(BigDecimal hectareas) {
		this.hectareas = hectareas;
	}

	public Finca getFinca() {
		return this.finca;
	}

	public void setFinca(Finca finca) {
		this.finca = finca;
	}

	public Tipocafe getTipocafe() {
		return this.tipocafe;
	}

	public void setTipocafe(Tipocafe tipocafe) {
		this.tipocafe = tipocafe;
	}

}