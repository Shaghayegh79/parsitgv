package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Account;
//@CrossOrigin
public interface AccountRepository extends CrudRepository<Account,Long>{
	Account findByUsername(String username);
}
