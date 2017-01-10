package com.ut.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPOCAFE database table.
 * 
 */
@Entity
@Table(name="TIPOCAFE")
@NamedQuery(name="Tipocafe.findAll", query="SELECT t FROM Tipocafe t")
public class Tipocafe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Long codigo;

	@Column(length=100)
	private String desctipocafe;

	@Column(length=50)
	private String tipocafe;

	//bi-directional many-to-one association to Lote
	@OneToMany(mappedBy="tipocafe")
	private List<Lote> lotes;

	public Tipocafe() {
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDesctipocafe() {
		return this.desctipocafe;
	}

	public void setDesctipocafe(String desctipocafe) {
		this.desctipocafe = desctipocafe;
	}

	public String getTipocafe() {
		return this.tipocafe;
	}

	public void setTipocafe(String tipocafe) {
		this.tipocafe = tipocafe;
	}

	public List<Lote> getLotes() {
		return this.lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public Lote addLote(Lote lote) {
		getLotes().add(lote);
		lote.setTipocafe(this);

		return lote;
	}

	public Lote removeLote(Lote lote) {
		getLotes().remove(lote);
		lote.setTipocafe(null);

		return lote;
	}

}