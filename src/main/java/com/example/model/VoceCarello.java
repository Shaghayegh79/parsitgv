package com.example.model;

import java.math.BigDecimal;
import java.util.HashMap;

public class VoceCarello {
	private int idProdotto;
	private HashMap<Integer, Boolean> ingExtraScelti= new HashMap<Integer,Boolean>();

	public VoceCarello() {
		super();
	}
	public VoceCarello(int idProdotto, String nome, BigDecimal prezzo, HashMap<Integer, Boolean> ingExtraScelti) {
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

	public HashMap<Integer, Boolean> getIngExtraScelti() {
		return ingExtraScelti;
	}
	public void setIngExtraScelti(HashMap<Integer, Boolean> ingExtraScelti) {
		this.ingExtraScelti = ingExtraScelti;
	}

	
}
