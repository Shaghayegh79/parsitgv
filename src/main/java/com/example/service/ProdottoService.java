package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Prodotto;
import com.example.repository.ProdottoRepository;
//@CrossOrigin
@Service
public class ProdottoService {
	@Autowired 
	private ProdottoRepository prodottoRepository;
	public Prodotto addProdotto(Prodotto prodotto) {
		return prodottoRepository.save(prodotto);
	}
  /*
    @Cacheable(
            value = "greetings",
            key = "#id")*/
	public List<Prodotto> getProdotti() {
		return (List<Prodotto>) prodottoRepository.findAll();
	}
	public Prodotto getProdotto(String nome) {
		return prodottoRepository.findByNome(nome);
	}
}
