package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Ingextra;
import com.example.model.Prodotto;
import com.example.repository.IngextraRepository;
//@CrossOrigin

@Service
public class IngextraService {
	@Autowired 
	private IngextraRepository ingextraRepository;
	public Ingextra addIngextra(Ingextra ingextra) {
		return ingextraRepository.save(ingextra);
	}
	public List<Ingextra> getAllIngextra() {
		return (List<Ingextra>) ingextraRepository.findAll();
	}
	public Ingextra getIngextra(String nome) {
		return ingextraRepository.findByNome(nome);
	}
	public Ingextra getIngextraByIdingextra(int idingextra) {
		return ingextraRepository.findByIdingextra(idingextra);
	}
}