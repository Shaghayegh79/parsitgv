package com.example.model;

import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

//import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@CrossOrigin
@Entity
@Table(name = "tab_ingextra", schema="parsitgv")

public class Ingextra {
	@Id @GeneratedValue
	int idingextra;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Column(columnDefinition = "DECIMAL(6,2)")
	private BigDecimal prezzo;

	@OneToMany(mappedBy="ingextra")
	private Set<VoceIngextra> voceIngextra;

	
	public Ingextra() {
		//super();
	}
	public Ingextra(int idingextra, String nome, BigDecimal prezzo, Set<VoceIngextra> voceIngextra) {
		//super();
		this.idingextra = idingextra;
		this.nome = nome;
		this.prezzo = prezzo;
		this.voceIngextra = voceIngextra;
	}

	@XmlTransient
	@JsonIgnore
	public Set<VoceIngextra> getVoceIngextra() {
		return voceIngextra;
	}

	public void setVoceIngextra(Set<VoceIngextra> voceIngextra) {
		this.voceIngextra = voceIngextra;
	}
	public int getIdingextra() {
		return idingextra;
	}

	public void setIdingextra(int idingextra) {
		this.idingextra = idingextra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	

}
