package org.chies.wsthreadsafe.server.model;

import java.io.Serializable;

public class Car implements Serializable {
	
	private static final long serialVersionUID = 4414882116412216795L;

	private String color;
	private Integer gears;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getGears() {
		return gears;
	}
	public void setGears(Integer gears) {
		this.gears = gears;
	}

}
