package com.example.model;

import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


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

	public Ingextra() {
		//super();
	}
	public Ingextra(int idingextra, String nome, BigDecimal prezzo, Set<VoceIngextra> voceIngextra) {
		//super();
		this.idingextra = idingextra;
		this.nome = nome;
		this.prezzo = prezzo;
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
