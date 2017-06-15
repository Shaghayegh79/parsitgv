package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Cliente;
//@CrossOrigin
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
