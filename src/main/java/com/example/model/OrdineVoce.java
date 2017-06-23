package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@CrossOrigin
	@Entity
	@Table(name="tab_ordine_voce")
	public class OrdineVoce {
		@Id @GeneratedValue
		private long idvoce;
		
		@ManyToOne(cascade=CascadeType.ALL)
	   // @Cascade({CascadeType.ALL})
		@JoinColumn(name="tab_prodotto_idprodotto", nullable=false)
		private Prodotto prodotto;
		
		@Column(name="tab_ordine_idordine")
		private Long idordine;

	    @OneToMany(cascade=CascadeType.ALL)
		@JoinColumn(name="tab_ordine_voce_idvoce")
		private Set<VoceIngextra> voceIngextras;

		public OrdineVoce() {
			//super();
		}

		public OrdineVoce(long idvoce, Prodotto prodotto, Long idordine, Set<VoceIngextra> voceIngextras) {
			//super();
			this.idvoce = idvoce;
			this.prodotto = prodotto;
			this.idordine = idordine;
			this.voceIngextras = voceIngextras;
		}

		public long getIdvoce() {
			return idvoce;
		}

		public void setIdvoce(long idvoce) {
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

		public Set<VoceIngextra> getVoceIngextras() {
			return voceIngextras;
		}

		public void setVoceIngextras(Set<VoceIngextra> voceIngextras) {
			this.voceIngextras = voceIngextras;
		}

}
