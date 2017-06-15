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

import com.example.model.Account;
import com.example.service.AccountServiceBean;

@RestController
@CrossOrigin
public class AccountController {
	@Autowired 	
	private AccountServiceBean accountServiceBean;
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> addCliente(@RequestBody Account account){
		
		return new ResponseEntity<Account>(accountServiceBean.addAccount(account),HttpStatus.OK);
						
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAccounts(Account account){
		List<Account> listaAccounts=accountServiceBean.getAccounts();
		return new ResponseEntity<List<Account>>(listaAccounts,HttpStatus.OK);
	}
	
	@GetMapping("/accounts/{username}")
	public ResponseEntity<Account> getAccount(@PathVariable String username){
		Account account=accountServiceBean.getAccount(username);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
	/*@RequestMapping(value="/accounts/{accountId}/clienti")
	public ClienteController getClienteController()
	{
		return new ClienteController();
	}*/
}

