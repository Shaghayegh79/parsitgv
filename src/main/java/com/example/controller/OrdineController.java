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

import com.example.model.Ordine;
import com.example.service.OrdineService;
@RestController
@CrossOrigin

public class OrdineController {
	@Autowired
	private OrdineService ordineService;

	@PostMapping("clienti/{idCliente}/ordini")
	public ResponseEntity<Ordine> addOrdine(@RequestBody Ordine ordine,@PathVariable Long idCliente){
		Ordine newOrdine=new Ordine();
		newOrdine= ordineService.addOrdine(ordine,idCliente);
		
		return new ResponseEntity<Ordine>(newOrdine,HttpStatus.OK);
						
	}
	
	@GetMapping("clienti/{idCliente}/ordini")
	public ResponseEntity<List<Ordine>> getOrdiniDelCliente(@PathVariable Long idCliente){
		List<Ordine> listaOrdiniDelCliente= ordineService.getOrdiniDelCliente(idCliente);
		
		return new ResponseEntity<List<Ordine>>(listaOrdiniDelCliente,HttpStatus.OK);
	}
	@GetMapping("clienti/{idCliente}/ordini/{idOrdine}")
	public ResponseEntity<Ordine> getOrdineDelCliente(@PathVariable Long idCliente,@PathVariable Long idOrdine){
		Ordine OrdiniDelCliente= ordineService.getOrdineDelCliente(idCliente,idOrdine);
		
		return new ResponseEntity<Ordine>(OrdiniDelCliente,HttpStatus.OK);
	}

	
	@GetMapping("/ordini")
	public ResponseEntity<List<Ordine>> getOrdini(){
		
		List<Ordine> listaOrdini= ordineService.getOrdini();
		return new ResponseEntity<List<Ordine>>(listaOrdini,HttpStatus.OK);
	}
	
}
