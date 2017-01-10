package com.ut.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAFICULTOR database table.
 * 
 */
@Entity
@Table(name="CAFICULTOR")
@NamedQuery(name="Caficultor.findAll", query="SELECT c FROM Caficultor c")
public class Caficultor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=30)
	private String idusuario;

	@Column(length=30)
	private String apellido1;

	@Column(length=30)
	private String apellido2;

	@Column(length=100)
	private String direccion;

	@Column(length=30)
	private String email;

	@Column(length=20)
	private String estadocivil;

	@Column(length=30)
	private String fechanac;

	@Column(length=2)
	private String genero;

	@Column(length=30)
	private String nombre1;

	@Column(length=30)
	private String nombre2;

	@Column(length=20)
	private String passwordcafi;

	@Column(length=20)
	private String telcel;

	@Column(length=20)
	private String telfijo;

	//bi-directional many-to-one association to Asociacion
	@ManyToOne
	@JoinColumn(name="IDASOCIACION")
	private Asociacion asociacion;

	//bi-directional many-to-one association to Finca
	@OneToMany(mappedBy="caficultor")
	private List<Finca> fincas;

	public Caficultor() {
	}

	public String getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getFechanac() {
		return this.fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre1() {
		return this.nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return this.nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getPasswordcafi() {
		return this.passwordcafi;
	}

	public void setPasswordcafi(String passwordcafi) {
		this.passwordcafi = passwordcafi;
	}

	public String getTelcel() {
		return this.telcel;
	}

	public void setTelcel(String telcel) {
		this.telcel = telcel;
	}

	public String getTelfijo() {
		return this.telfijo;
	}

	public void setTelfijo(String telfijo) {
		this.telfijo = telfijo;
	}

	public Asociacion getAsociacion() {
		return this.asociacion;
	}

	public void setAsociacion(Asociacion asociacion) {
		this.asociacion = asociacion;
	}

	public List<Finca> getFincas() {
		return this.fincas;
	}

	public void setFincas(List<Finca> fincas) {
		this.fincas = fincas;
	}

	public Finca addFinca(Finca finca) {
		getFincas().add(finca);
		finca.setCaficultor(this);

		return finca;
	}

	public Finca removeFinca(Finca finca) {
		getFincas().remove(finca);
		finca.setCaficultor(null);

		return finca;
	}

}