package com.example.model;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

//import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
@Entity
@Table(name = "tab_cliente", schema="parsitgv")

public class Cliente {
	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	@NotNull
	private String cognome;
	private String indirizzo;
	@NotNull
	private String telefono;
	private String dataiscrizione;
	
	@OneToOne(mappedBy="cliente")
	private Account account;
	
	@OneToMany(mappedBy="cliente")
	private Set<Ordine> ordini;



	public Cliente() {
	}

	public Cliente(Long id, String nome, String cognome, String indirizzo, String telefono, String dataiscrizione,
			Account account) {
		//super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.dataiscrizione = dataiscrizione;
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDataiscrizione() {
		return dataiscrizione;
	}

	public void setDataiscrizione(String dataiscrizione) {
		this.dataiscrizione = dataiscrizione;
	}
	@XmlTransient
	@JsonIgnore
	public Set<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(Set<Ordine> ordini) {
		this.ordini = ordini;
	}
	@XmlTransient
	@JsonIgnore
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

		
	
	
	


}
