package com.example.model;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

//import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
@Entity
@Table(name = "tab_ordine", schema="parsitgv")
public class Ordine {
	@Id @GeneratedValue
	@Column(name="idordine")
	private Long idordine;
	@Column(name="statoordine")
	private int statoordine;
	@Column(name="bibitedolci")
	private int bibitedolci;
	@Column(name="nota")
	private String nota;
	@Column(name="data")
	private String data;
	@Column(name="tab_cliente_id")
	private Long idcliente;
   
	@OneToMany
	@JoinColumn(name="tab_ordine_idordine")
	private Set<OrdineVoce> ordineVoci;

	public Ordine() {
		//super();
	}
	public Ordine(Long idordine, int statoordine, int bibitedolci, String commento, String data, Long idcliente,
			Cliente cliente, Set<OrdineVoce> ordineVoci) {
		//super();
		this.idordine = idordine;
		this.statoordine = statoordine;
		this.bibitedolci = bibitedolci;
		this.nota = nota;
		this.data = data;
	//	this.cliente = cliente;
		this.ordineVoci = ordineVoci;
		this.idcliente = idcliente;
	}
	public Set<OrdineVoce> getOrdineVoci() {
		return ordineVoci;
	}

	public void setOrdineVoci(Set<OrdineVoce> ordineVoci) {
		this.ordineVoci = ordineVoci;
	}

	public Long getIdordine() {
		return idordine;
	}

	public void setIdordine(Long idordine) {
		this.idordine = idordine;
	}

	public int getStatoordine() {
		return statoordine;
	}

	public void setStatoordine(int statoordine) {
		this.statoordine = statoordine;
	}

	public int getBibitedolci() {
		return bibitedolci;
	}

	public void setBibitedolci(int bibitedolci) {
		this.bibitedolci = bibitedolci;
	}

	public String getNota() {
		return nota;
	}

	public void setCommento(String nota) {
		this.nota = nota;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public Long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Long idCliente) {
		this.idcliente = idCliente;
	}
/*	@XmlTransient
	@JsonIgnore
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}*/
	
} 