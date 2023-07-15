package com.prowings.serialize_practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("Employee.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			Employee deserialsedEmp = (Employee) in.readObject();

			System.out.println(deserialsedEmp);

		} catch (Exception e) {
			System.out.println("Exception while deserializing Stream !!!");

			e.printStackTrace();

		}
	}

}
