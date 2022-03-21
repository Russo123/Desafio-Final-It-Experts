package com.itexperts.projeto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nameOwner;
	private String agencyCode;
	private String accountCode;
	private String verificationDigital;

	 //private List<Card> cards;

	public Account() {

	}

	public Account(Long id, String nameOwner, String agencyCode, String accountCode, String verificationDigital) {
		this.id = id;
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigital = verificationDigital;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getVerificationDigital() {
		return verificationDigital;
	}

	public void setVerificationDigital(String verificationDigital) {
		this.verificationDigital = verificationDigital;
	}

}
