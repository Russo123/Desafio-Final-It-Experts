package com.itexperts.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	// private Flag flag;
	private Type typeCard;
	private String number;
	private String digitCode;
	private Double limitBalance;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Account account;

	// @ManyToOne(cascade=CascadeType.PERSIST)
	@OneToMany(mappedBy = "cards")
	private List<Type> types;
	
	
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
		this.types = types;
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
	
	public List<Type> getTypes(List<Type> types){
		return types;
		
	}

		public void setTypes(List<Type> types) {
			this.types = types;
		}
}
