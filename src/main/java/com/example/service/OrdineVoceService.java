package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.OrdineVoce;
import com.example.repository.OrdineVoceRepository;

@Service
public class OrdineVoceService {

	@Autowired 
	private OrdineVoceRepository ordineVoceRepository;
	public OrdineVoce addOrdineVoce(OrdineVoce ordineVoce)
	{
		OrdineVoce newOrdineVoce=ordineVoceRepository.save(ordineVoce);
		return newOrdineVoce;
	}
}
