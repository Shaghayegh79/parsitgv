package com.example.model;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

//import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
@Entity
@Table(name = "tab_ordine", schema="parsitgv")
public class Ordine {
	@Id @GeneratedValue
	@Column(name="idordine")
	private long idordine;
	@Column(name="statoordine")
	private int statoordine;
	@Column(name="bibitedolci")
	private boolean bibitedolci;
	@Column(name="nota")
	private String nota;
	@Column(name="data")
	private Date data;
	@NotNull
	@Column(name="tab_cliente_id")
	private long idcliente;
  
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="tab_ordine_idordine")
	private Set<OrdineVoce> ordineVoci;

	public Ordine() {
		//super();
	}

	public Ordine(long idordine, int statoordine, boolean bibitedolci, String nota, Date data, long idcliente,
			Set<OrdineVoce> ordineVoci) {
		super();
		this.idordine = idordine;
		this.statoordine = statoordine;
		this.bibitedolci = bibitedolci;
		this.nota = nota;
		this.data = data;
		this.idcliente = idcliente;
		this.ordineVoci = ordineVoci;
	}

	public Set<OrdineVoce> getOrdineVoci() {
		return ordineVoci;
	}

	public void setOrdineVoci(Set<OrdineVoce> ordineVoci) {
		this.ordineVoci = ordineVoci;
	}

	public long getIdordine() {
		return idordine;
	}

	public void setIdordine(long idordine) {
		this.idordine = idordine;
	}

	public int getStatoordine() {
		return statoordine;
	}

	public void setStatoordine(int statoordine) {
		this.statoordine = statoordine;
	}

	public boolean getBibitedolci() {
		return bibitedolci;
	}

	public void setBibitedolci(boolean bibitedolci) {
		this.bibitedolci = bibitedolci;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(long idCliente) {
		this.idcliente = idCliente;
	}

	
} 