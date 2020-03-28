package com.moneytransfer.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneytransfer.poc.domain.Account;
import com.moneytransfer.poc.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> findAll() {
		return this.accountRepository.findAll();
	}
	
	public Account findById(int id) {
		return this.accountRepository.findById(id);
	}

	public void save(Account account) {
		this.accountRepository.save(account);
	}
	
}