package org.chies.wsthreadsafe.server.model;

import java.io.Serializable;

public class House implements Serializable{

	private static final long serialVersionUID = -7098886840501410282L;
	private String avenue;
	private Integer number;
	public String getAvenue() {
		return avenue;
	}
	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
}
