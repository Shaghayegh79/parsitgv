package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Account;
import com.example.repository.AccountRepository;
//@CrossOrigin
@Service
public class AccountServiceBean {

	@Autowired
	private AccountRepository accountRepository;
	
	public Account addAccount(Account account)
	{
		accountRepository.save(account);
		return account;
		
	}

	public List<Account> getAccounts()
	{
		return (List<Account>)accountRepository.findAll();
	}
	
	public Account getAccount(String username)
	{
		return accountRepository.findByUsername(username);
	}

}
