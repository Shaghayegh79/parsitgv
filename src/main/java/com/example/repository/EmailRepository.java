package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Email;
//@CrossOrigin
public interface EmailRepository extends CrudRepository<Email, Long> {
	 Email findByEmailid(String emailId);
	 
}
