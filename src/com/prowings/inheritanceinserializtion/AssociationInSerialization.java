package com.prowings.inheritanceinserializtion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AssociationInSerialization {
	
	public static void main(String[] args) {
		
		Street street = new Street(123,"M G Road");
		
		Address address = new Address(1234,"Pune","India",street);
		
		Person p1 = new Person(123,"Ram", address);
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			file = new FileOutputStream("person.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(p1);
			
			System.out.println("object serialized successfully !!!");
		}
		catch (Exception e) 
		{

			System.out.println("Exception while serializing the object !! :"+ e.getMessage());
			
			e.printStackTrace();
			
			
		}
		finally {
			
			try {
			out.close();
			file.close();
			}
			catch (IOException e) 
			{
				System.out.println("Error while closing the resources !!!");
				e.printStackTrace();
			}
		}
	}

}
