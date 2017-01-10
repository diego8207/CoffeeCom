package com.ut.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FINCA database table.
 * 
 */
@Entity
@Table(name="FINCA")
@NamedQuery(name="Finca.findAll", query="SELECT f FROM Finca f")
public class Finca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=30)
	private String idfinca;

	@Column(length=50)
	private String distrito;

	@Column(nullable=false, length=30)
	private String latitud;

	@Column(nullable=false, length=30)
	private String longitud;

	@Column(nullable=false, length=50)
	private String municipio;

	@Column(nullable=false, length=50)
	private String nombre;

	@Column(nullable=false, length=50)
	private String vereda;

	//bi-directional many-to-one association to Lote
	@OneToMany(mappedBy="finca")
	private List<Lote> lotes;

	//bi-directional many-to-one association to Caficultor
	@ManyToOne
	@JoinColumn(name="IDUSUARIO")
	private Caficultor caficultor;

	public Finca() {
	}

	public String getIdfinca() {
		return this.idfinca;
	}

	public void setIdfinca(String idfinca) {
		this.idfinca = idfinca;
	}

	public String getDistrito() {
		return this.distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVereda() {
		return this.vereda;
	}

	public void setVereda(String vereda) {
		this.vereda = vereda;
	}

	public List<Lote> getLotes() {
		return this.lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public Lote addLote(Lote lote) {
		getLotes().add(lote);
		lote.setFinca(this);

		return lote;
	}

	public Lote removeLote(Lote lote) {
		getLotes().remove(lote);
		lote.setFinca(null);

		return lote;
	}

	public Caficultor getCaficultor() {
		return this.caficultor;
	}

	public void setCaficultor(Caficultor caficultor) {
		this.caficultor = caficultor;
	}

}