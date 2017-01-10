package com.ut.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ASOCIACION database table.
 * 
 */
@Entity
@Table(name="ASOCIACION")
@NamedQuery(name="Asociacion.findAll", query="SELECT a FROM Asociacion a")
public class Asociacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=50)
	private String idasociacion;

	@Column(length=100)
	private String direccionoficina;

	@Column(length=20)
	private String passwordaso;

	@Column(length=100)
	private String razonsocial;

	@Column(length=20)
	private String teloficina;

	//bi-directional many-to-one association to Caficultor
	@OneToMany(mappedBy="asociacion")
	private List<Caficultor> caficultors;

	public Asociacion() {
	}

	public String getIdasociacion() {
		return this.idasociacion;
	}

	public void setIdasociacion(String idasociacion) {
		this.idasociacion = idasociacion;
	}

	public String getDireccionoficina() {
		return this.direccionoficina;
	}

	public void setDireccionoficina(String direccionoficina) {
		this.direccionoficina = direccionoficina;
	}

	public String getPasswordaso() {
		return this.passwordaso;
	}

	public void setPasswordaso(String passwordaso) {
		this.passwordaso = passwordaso;
	}

	public String getRazonsocial() {
		return this.razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getTeloficina() {
		return this.teloficina;
	}

	public void setTeloficina(String teloficina) {
		this.teloficina = teloficina;
	}

	public List<Caficultor> getCaficultors() {
		return this.caficultors;
	}

	public void setCaficultors(List<Caficultor> caficultors) {
		this.caficultors = caficultors;
	}

	public Caficultor addCaficultor(Caficultor caficultor) {
		getCaficultors().add(caficultor);
		caficultor.setAsociacion(this);

		return caficultor;
	}

	public Caficultor removeCaficultor(Caficultor caficultor) {
		getCaficultors().remove(caficultor);
		caficultor.setAsociacion(null);

		return caficultor;
	}

}