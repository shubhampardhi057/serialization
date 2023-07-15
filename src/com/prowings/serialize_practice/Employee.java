package com.prowings.serialize_practice;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	String address;
	
	 private static final long serialVersionUID = 9876543210l;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
}
