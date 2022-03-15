package com.itexperts.projeto.model;

public class Cards {

	private Integer id;
	private String name;

	// private Flag flag;
	private Type typeCard;
	private String number;
	private String digitCode;
	private Double limitBalance;
	private Account account;

	public Cards() {
	}

	public Cards(Integer id, String name, Type typeCard, String number, String digitCode, Double limitBalance,
			Account account) {
		this.id = id;
		this.name = name;
		this.typeCard = typeCard;
		this.number = number;
		this.digitCode = digitCode;
		this.limitBalance = limitBalance;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(Type typeCard) {
		this.typeCard = typeCard;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDigitCode() {
		return digitCode;
	}

	public void setDigitCode(String digitCode) {
		this.digitCode = digitCode;
	}

	public Double getLimitBalance() {
		return limitBalance;
	}

	public void setLimitBalance(Double limitBalance) {
		this.limitBalance = limitBalance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
