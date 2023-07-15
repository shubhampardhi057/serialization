package com.prowings.inheritanceinserializtion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InheritanceInDeserialization {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream file = new FileInputStream("dog.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			
			Dog deserializedDog = (Dog) in.readObject();
			
			System.out.println(deserializedDog);	
		}
		catch (Exception e) 
		{
		
			System.out.println("Exception while Deserilazing Stream!!!"+e.getMessage());
			
			e.printStackTrace();

		}
	}

}
