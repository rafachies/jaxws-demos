package org.chies.wsthreadsafe.server.model;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = 4815974792766840883L;
	private String name;
	private Integer employees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployees() {
		return employees;
	}
	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
}
