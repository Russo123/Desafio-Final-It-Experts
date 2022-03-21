package com.itexperts.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping
	public ResponseEntity<List<Account>> getAll() {
		List<Account> account = accountService.getAll();
		return ResponseEntity.ok().body(account);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@RequestBody Account account, @PathVariable Long id){
		accountService.update(account, id);
		return ResponseEntity.noContent().build();
	}

}
