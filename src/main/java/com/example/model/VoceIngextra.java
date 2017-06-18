package com.example.model;

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
	private Long id;
	
	@Column(name="tab_ordine_voce_idvoce")
	private int idvoce;
	
	@ManyToOne
	@JoinColumn(name="tab_ingextra_idingextra")
	private Ingextra ingextra;
	

	public VoceIngextra() {
		//super();
	}

	public VoceIngextra(Long id, int idingextra, Ingextra ingextra, int idvoce, OrdineVoce ordineVoce) {
		//super();
		this.id = id;
		this.ingextra = ingextra;
		this.idvoce = idvoce;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ingextra getIngextra() {
		return ingextra;
	}

	public void setIngextra(Ingextra ingextra) {
		this.ingextra = ingextra;
	}

	public int getIdvoce() {
		return idvoce;
	}

	public void setIdvoce(int idvoce) {
		this.idvoce = idvoce;
	}
}
