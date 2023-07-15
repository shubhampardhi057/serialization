package com.prowings.inheritanceinserializtion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AssociationInDeserialization {
	
	public static void main(String[] args) {
		
		try {
			 FileInputStream file = new FileInputStream("person.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 Person deserializedPerson = (Person) in.readObject();
	         
			 System.out.println(deserializedPerson);
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
	}

}
