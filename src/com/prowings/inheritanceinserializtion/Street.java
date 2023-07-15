package com.prowings.inheritanceinserializtion;

import java.io.Serializable;

public class Street implements Serializable {

	int streetNumber;
	String name;
	

	public Street() {
		super();
	}
	
	public Street(int streetNumber, String name) {
		super();
		this.streetNumber = streetNumber;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Street [streetNumber=" + streetNumber + ", name=" + name + "]";
	}

}
