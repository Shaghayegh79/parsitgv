package com.example.model;

import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class WrapperCarello {
    private Ordine ordine;
    private Set<VoceCarello> vociCarello;
	public WrapperCarello() {
		//super();
	}
	public WrapperCarello(Ordine ordine, Set<VoceCarello> vociCarello) {
		//super();
		this.ordine = ordine;
		this.vociCarello = vociCarello;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	public Set<VoceCarello> getVociCarello() {
		return vociCarello;
	}
	public void setVociCarello(Set<VoceCarello> vociCarello) {
		this.vociCarello = vociCarello;
	}
    
	
}
