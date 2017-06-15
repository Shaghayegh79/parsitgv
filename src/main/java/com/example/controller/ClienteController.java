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

import com.example.model.Cliente;
import com.example.service.ClienteService;

@RestController
@CrossOrigin
public class ClienteController {
	@Autowired 	
	private ClienteService clienteService;

	@PostMapping("/clienti")
	public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){

		return new ResponseEntity<Cliente>(clienteService.addCliente(cliente),HttpStatus.OK);
	}
	
	@GetMapping("/clienti")
	public ResponseEntity<List<Cliente>> getClienti(){
		List<Cliente> listaClienti=clienteService.getClienti();
		return new ResponseEntity<List<Cliente>>(listaClienti,HttpStatus.OK);
	}
	@GetMapping("/clienti/{idCliente}")
	public ResponseEntity<Cliente> getCliente(@PathVariable Long idCliente){
		Cliente cliente=clienteService.getCliente(idCliente);
		return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
	}
}
