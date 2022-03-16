package com.itexperts.projeto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Type implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String name;

	public Type() {
	}

	public Type(Integer id, String name) {
		this.id = id;
		this.name = name;
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

}
