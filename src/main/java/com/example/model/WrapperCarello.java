package com.example.model;

import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class WrapperCarello {
    private Ordine ordine;
    private Set<VoceCarello> carello;
    
	public Ordine getOrdine() {
		return ordine;
	}
	
	public WrapperCarello(Ordine ordine, Set<VoceCarello> carello) {
		//super();
		this.ordine = ordine;
		this.carello = carello;
	}

	public WrapperCarello() {
		//super();
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	public Set<VoceCarello> getCarello() {
		return carello;
	}
	public void setCarello(Set<VoceCarello> carello) {
		this.carello = carello;
	}
	
}
