package com.example.service;

import java.util.List;

import com.example.model.Account;

public interface AccountService {
	 Account addAccount(Account account);
	 List<Account> getAccounts();
	 Account getAccount(String username);
}
