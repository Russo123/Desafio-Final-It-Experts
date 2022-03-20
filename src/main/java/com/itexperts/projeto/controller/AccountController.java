package com.itexperts.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.service.AccountService;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping
	public ResponseEntity<Account> create(@RequestBody Account account) {
		Account a = new Account();
		a = accountService.create(account);

		return ResponseEntity.ok().body(a);

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Account> getById(@PathVariable Long id) {
		Account account = accountService.getById(id);
		return ResponseEntity.ok().body(account);

	}

}
