package com.prowings.inheritanceinserializtion;

import java.io.Serializable;

public class Person implements Serializable {

	int id;
	String name;
	Address address;
	
	
	public Person() {
		super();
	}


	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
