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

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
	@Entity
	@Table(name="tab_ordine_voce")
	public class OrdineVoce {
		@Id @GeneratedValue
		private int idvoce;
		
		@Column(name="tab_prodotto_idprodotto",insertable = true, updatable = true)
		private Long idprodotto;
		
		@ManyToOne
		@JoinColumn(name="tab_prodotto_idprodotto",insertable = false, updatable = false)
		private Prodotto prodotto;
		
		@Column(name="tab_ordine_idordine",insertable = true, updatable = true)
		private Long idordine;
		
		@ManyToOne
		@JoinColumn(name="tab_ordine_idordine",insertable = false, updatable = false)
		private Ordine ordine;
		
		@OneToMany(mappedBy="ordineVoce")
		private Set<VoceIngextra> voceIngextra; 
		
		public OrdineVoce() {
			//super();
		}

		public OrdineVoce(int idvoce, Long idprodotto, Prodotto prodotto, Long idordine, Ordine ordine,
				Set<VoceIngextra> voceIngextra) {
			super();
			this.idvoce = idvoce;
			this.idprodotto = idprodotto;
			this.prodotto = prodotto;
			this.idordine = idordine;
			this.ordine = ordine;
			this.voceIngextra = voceIngextra;
		}
		public int getIdvoce() {
			return idvoce;
		}

		public void setIdvoce(int idvoce) {
			this.idvoce = idvoce;
		}
		@XmlTransient
		@JsonIgnore
		public Long getIdordine() {
			return idordine;
		}
		public void setIdordine(Long idordine) {
			this.idordine = idordine;
		}
		public Long getIdprodotto() {
			return idprodotto;
		}
		public void setIdprodotto(Long idprodotto) {
			this.idprodotto = idprodotto;
		}
		@XmlTransient
		@JsonIgnore
		public Prodotto getProdotto() {
			return prodotto;
		}

		public void setProdotto(Prodotto prodotto) {
			this.prodotto = prodotto;
		}
		@XmlTransient
		@JsonIgnore
		public Ordine getOrdine() {
			return ordine;
		}

		public void setOrdine(Ordine ordine) {
			this.ordine = ordine;
		}

		public Set<VoceIngextra> getVoceIngextra() {
			return voceIngextra;
		}

		public void setVoceIngextra(Set<VoceIngextra> voceIngextra) {
			this.voceIngextra = voceIngextra;
		}

	
}
