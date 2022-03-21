package com.itexperts.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public Account create(Account account) {
		Account a = new Account();
		a = accountRepository.save(account);
		return a;
	}

	public Account getById(Long id) {
		Optional<Account> accountReturned = accountRepository.findById(id);
		accountReturned.orElseThrow(() -> new RuntimeException("Account not found"));
		return accountReturned.get();
	}
	
	public List<Account> getAll(){
		List<Account> account = accountRepository.findAll();
		return account;
	}
	
	public void update(Account account, Long id) {
		
		Optional<Account> accountReturned = accountRepository.findById(id);
		
		accountReturned.orElseThrow(() -> new RuntimeException("Account not found"));
		
		accountReturned.get().setNameOwner(account.getNameOwner());
		accountReturned.get().setAgencyCode(account.getAgencyCode());
		accountReturned.get().setAccountCode(account.getAccountCode());
		accountReturned.get().setVerificationDigital(account.getVerificationDigital());
		
		accountRepository.save(accountReturned.get());
	}
	
}
