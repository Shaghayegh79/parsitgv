package com.example.model;

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
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;
//@CrossOrigin
	@Entity
	@Table(name="tab_ordine_voce")
	public class OrdineVoce {
		@Id @GeneratedValue
		private int idvoce;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="tab_prodotto_idprodotto", nullable=false)
		private Prodotto prodotto;
		
		@Column(name="tab_ordine_idordine")
		private Long idordine;

		@OneToMany
		@JoinColumn(name="tab_ordine_voce_idvoce")
		private Set<VoceIngextra> voceIngextra; 
		
		public OrdineVoce() {
			//super();
		}

		public OrdineVoce(int idvoce, Prodotto prodotto, Long idordine, Set<VoceIngextra> voceIngextra) {
			super();
			this.idvoce = idvoce;
			this.prodotto = prodotto;
			this.idordine = idordine;
			this.voceIngextra = voceIngextra;
		}

		public int getIdvoce() {
			return idvoce;
		}

		public void setIdvoce(int idvoce) {
			this.idvoce = idvoce;
		}

		public Prodotto getProdotto() {
			return prodotto;
		}

		public void setProdotto(Prodotto prodotto) {
			this.prodotto = prodotto;
		}

		public Long getIdordine() {
			return idordine;
		}

		public void setIdordine(Long idordine) {
			this.idordine = idordine;
		}

		public Set<VoceIngextra> getVoceIngextra() {
			return voceIngextra;
		}

		public void setVoceIngextra(Set<VoceIngextra> voceIngextra) {
			this.voceIngextra = voceIngextra;
		}

		
}
