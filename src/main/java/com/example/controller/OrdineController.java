package com.example.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.VoceCarello;
import com.example.model.Ordine;
import com.example.model.OrdineVoce;
import com.example.model.WrapperCarello;
import com.example.service.OrdineService;
import com.example.service.OrdineVoceService;
import com.example.service.ProdottoService;
@RestController
@CrossOrigin
public class OrdineController {

	@Autowired
	private OrdineService ordineService;
	@Autowired
	private ProdottoService prodottoService;
	private long idOrdine;
	@PostMapping("clienti/{idCliente}/ordini")
	public ResponseEntity<Ordine> addOrdine(@RequestBody WrapperCarello wrapperCarello,@PathVariable Long idCliente){

		wrapperCarello.getOrdine().setBibitedolci(false);
		wrapperCarello.getOrdine().setStatoordine(0);
		wrapperCarello.getOrdine().setData(new Date());
		Ordine newOrdine=new Ordine();
		
		newOrdine= ordineService.addOrdine(wrapperCarello.getOrdine());
		idOrdine=newOrdine.getIdordine();
		
		OrdineVoce ordineVoce=new OrdineVoce();
		Set<OrdineVoce> ordineVoci= new HashSet<OrdineVoce>();		
		
		for(VoceCarello v : wrapperCarello.getCarello()){
		  ordineVoce.setProdotto(prodottoService.getProdottoById(v.getIdProdotto()));
		  ordineVoce.setIdordine(idOrdine);
		  ordineVoci.add(ordineVoce);
		}		
		newOrdine.setOrdineVoci(ordineVoci);
		newOrdine= ordineService.addOrdine(newOrdine);
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
