package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Cliente;
import com.example.repository.ClienteRepository;
//@CrossOrigin
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente addCliente(Cliente cliente)
	{
		clienteRepository.save(cliente);
		return cliente;
	}

	public Cliente getCliente(Long idCliente)
	{
		return clienteRepository.findOne(idCliente);
	}
	public List<Cliente> getClienti()
	{
		return (List<Cliente>)clienteRepository.findAll();
	}
	
}
