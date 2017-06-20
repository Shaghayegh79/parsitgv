package com.example.model;

import java.math.BigDecimal;
import java.util.HashMap;

public class VoceCarello {
	private int idProdotto;
	private HashMap<String, Boolean> ingExtraScelti= new HashMap<String,Boolean>();

	public VoceCarello() {
		super();
	}
	public VoceCarello(int idProdotto, String nome, BigDecimal prezzo, HashMap<String, Boolean> ingExtraScelti) {
		//super();
		this.idProdotto = idProdotto;
		this.ingExtraScelti = ingExtraScelti;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public HashMap<String, Boolean> getIngExtraScelti() {
		return ingExtraScelti;
	}
	public void setIngExtraScelti(HashMap<String, Boolean> ingExtraScelti) {
		this.ingExtraScelti = ingExtraScelti;
	}

	
}
