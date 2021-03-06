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
@Table(name = "tab_prodotto", schema="parsitgv")
/*@NamedStoredProcedureQueries({
	  @NamedStoredProcedureQuery(
	    name = "findByTipoprodottoProcedure", 
	    procedureName = "FIND_PRODOTTO_BY_TIPO", 
	    resultClasses = { Prodotto.class }, 
	    parameters = { 
	        @StoredProcedureParameter(
	          name = "tipoprodotto", 
	          type = String.class, 
	          mode = ParameterMode.IN) }) 
	})*/
public class Prodotto {

	@Id @GeneratedValue
	private int idprodotto;
	
	//@NotNull
	//private String label;
	
	@NotNull
	private String nome; 
	
	@NotNull
	private String tipoprodotto;
	
	@NotNull
	@Column(columnDefinition = "DECIMAL(6,2)")
	private BigDecimal prezzo;
	
	@NotNull
	private String ingredienti;
	
	private String foto;
	
	@NotNull
	private boolean disponibile;
	
	public Prodotto() {
		//super();
	}

	public Prodotto(int idprodotto, String nome, String tipoprodotto, BigDecimal prezzo, String ingredienti,
			String foto, boolean disponibile) {
		super();
		this.idprodotto = idprodotto;
		this.nome = nome;
		this.tipoprodotto = tipoprodotto;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.foto = foto;
		this.disponibile = disponibile;
	}

	public int getIdprodotto() {
		return idprodotto;
	}

	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoprodotto() {
		return tipoprodotto;
	}

	public void setTipoprodotto(String tipoprodotto) {
		this.tipoprodotto = tipoprodotto;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

}
