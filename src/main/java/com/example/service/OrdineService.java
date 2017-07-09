package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Ordine;
import com.example.repository.OrdineRepository;
//@CrossOrigin
@Service
public class OrdineService {
	@Autowired 
	private OrdineRepository ordineRepository;
	public Ordine addOrdine(Ordine ordine)
	{
		Ordine newOrdine=ordineRepository.save(ordine);
		return newOrdine;
	}
	public List<Ordine> getOrdini()
	{
		return (List<Ordine>)ordineRepository.findAll();
	}
	public List<Ordine> getOrdiniByStato(Integer statoOrdine)
	{
		return (List<Ordine>)ordineRepository.findByStatoordine(statoOrdine);
	}
	public List<Ordine> getOrdiniDelCliente(Long idCliente) {

		return (List<Ordine>)ordineRepository.findByIdcliente(idCliente);
	}

	public Ordine getOrdineDelCliente(Long idCliente, Long idOrdine) {
		return ordineRepository.findByIdordine(idOrdine);
	}

}
