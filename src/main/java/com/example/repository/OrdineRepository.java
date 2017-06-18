package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Ordine;
//@CrossOrigin
public interface OrdineRepository extends CrudRepository<Ordine, Long>{

	Ordine findByIdordine(Long idOrdine);
	List<Ordine> findByIdcliente(Long idCliente);

}
