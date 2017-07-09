package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Ordine;
//@CrossOrigin
public interface OrdineRepository extends CrudRepository<Ordine, Long>{

	Ordine findByIdordine(Long idordine);
	List<Ordine> findByStatoordine(int statoordine);
	List<Ordine> findByIdcliente(long idcliente);

}
