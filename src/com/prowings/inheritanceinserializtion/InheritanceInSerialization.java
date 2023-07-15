package com.prowings.inheritanceinserializtion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InheritanceInSerialization {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog(30);
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			file = new FileOutputStream("dog.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(d1);
			
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
