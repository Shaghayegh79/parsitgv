package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
@Entity
@Table(name = "tab_voce_ingextra",schema="parsitgv")

public class VoceIngextra {
	@Id @GeneratedValue
	private long id;
	
	@Column(name="tab_ordine_voce_idvoce")
	private Long idvoce;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tab_ingextra_idingextra", nullable=false)
	private Ingextra ingextra;
	

	public VoceIngextra() {
		//super();
	}


	public VoceIngextra(long id, Long idvoce, Ingextra ingextra) {
		super();
		this.id = id;
		this.idvoce = idvoce;
		this.ingextra = ingextra;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Long getIdvoce() {
		return idvoce;
	}


	public void setIdvoce(Long idvoce) {
		this.idvoce = idvoce;
	}


	public Ingextra getIngextra() {
		return ingextra;
	}


	public void setIngextra(Ingextra ingextra) {
		this.ingextra = ingextra;
	}


}
