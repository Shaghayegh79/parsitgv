package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Prodotto;
import com.example.service.ProdottoService;
@CrossOrigin
@RestController
public class ProdottiController {
	
	@Autowired 	
	private ProdottoService prodottoService;
	
	@PostMapping("/prodotti")
	public ResponseEntity<Prodotto> addProdotto(@RequestBody Prodotto prodotto){
		
		return new ResponseEntity<Prodotto>(prodottoService.addProdotto(prodotto),HttpStatus.OK);
						
	}
	
	@GetMapping("/prodotti")
	public ResponseEntity<List<Prodotto>> getProdotti(){
		List<Prodotto> listaProdotti=prodottoService.getProdotti();
		return new ResponseEntity<List<Prodotto>>(listaProdotti,HttpStatus.OK);
	}
	
	@GetMapping("/prodotti/{nome}")
	public ResponseEntity<Prodotto> getProdotto(@PathVariable String nome){
		return new ResponseEntity<Prodotto>(prodottoService.getProdotto(nome),HttpStatus.OK);
	}

}
