package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Ingextra;
//@CrossOrigin
public interface IngextraRepository extends CrudRepository<Ingextra, Integer> {
	Ingextra findByNome(String nome);

	Ingextra findByIdingextra(int idingextra);
	
}
