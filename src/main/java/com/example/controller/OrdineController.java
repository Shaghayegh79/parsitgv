package com.example.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
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
import com.example.model.VoceIngextra;
import com.example.model.Ordine;
import com.example.model.OrdineVoce;
import com.example.model.WrapperCarello;
import com.example.service.IngextraService;
import com.example.service.OrdineService;
import com.example.service.OrdineVoceService;
import com.example.service.ProdottoService;
import com.example.service.VoceIngextraService;
@RestController
@CrossOrigin
public class OrdineController {
	
	@Autowired
	private VoceIngextraService voceIngextraService;
	@Autowired
	private IngextraService ingextraService;
	@Autowired
	private OrdineService ordineService;
	@Autowired
	private ProdottoService prodottoService;
	@PostMapping("clienti/{idCliente}/ordini")
	public ResponseEntity<Ordine> addOrdine(@RequestBody WrapperCarello wrapperCarello,@PathVariable Long idCliente){
		OrdineVoce ordineVoce=new OrdineVoce();
		Set<OrdineVoce> ordineVoci= new HashSet<OrdineVoce>();	
		VoceIngextra voceIngextra=new VoceIngextra();
		Set<VoceIngextra> voceIngextras= new HashSet<VoceIngextra>();	

		for(VoceCarello v : wrapperCarello.getVociCarello()){
		  ordineVoce.setProdotto(prodottoService.getProdottoById(v.getIdProdotto()));
		  ordineVoci.add(ordineVoce);
		  
		  for (Entry<Integer, Boolean> entry : v.getIngExtraScelti().entrySet()) {
			    if (entry.getValue()==true) {
			    	voceIngextra.setIngextra(ingextraService.getIngextraByIdingextra(entry.getKey()));
			    	voceIngextraService.addVoceIngextra(voceIngextra);
			    	voceIngextras.add(voceIngextra);			
			    	System.out.print("tesssssst"+ingextraService.getIngextraByIdingextra(entry.getKey())+"teeeeest");
			    }
		 }
		 ordineVoce.setVoceIngextras(voceIngextras);
		 //voceIngextras.clear();
		}		
		//crea oggetto ordine dal ordine ricevuto 
		Ordine newOrdine=new Ordine();
		wrapperCarello.getOrdine().setBibitedolci(false);
		wrapperCarello.getOrdine().setStatoordine(0);
		wrapperCarello.getOrdine().setData(new Date());
		//collega l'oggetto ordine con gli oggetti voci 
		wrapperCarello.getOrdine().setOrdineVoci(ordineVoci);
		//
		newOrdine= ordineService.addOrdine(wrapperCarello.getOrdine());//ordine viene salvato in tabella ordine
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
/*		VoceIngextra voceIngextra=new VoceIngextra();
		Set<VoceIngextra> voceIngextras= new HashSet<VoceIngextra>();	

		for(VoceCarello v : wrapperCarello.getVociCarello()){
			 for (Map.Entry<Integer, Boolean> entry : v.getIngExtraScelti().entrySet()) {
				    if (entry.getValue()==true) {
				    	voceIngextra.setIngextra(ingextraService.getIngextraByIdingextra(entry.getKey()));
				    	voceIngextraService.addVoceIngextra(voceIngextra);
				    	voceIngextras.add(voceIngextra);				    	
				    }
			 }
			 ordineVoce.setVoceIngextras(voceIngextras);
			 voceIngextras.clear();
		}
		
		*/