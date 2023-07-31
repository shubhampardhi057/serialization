package com.prowings.customserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CustomDeserialization {
	
	public static void main(String[] args) {
//		
		try {
			 FileInputStream file = new FileInputStream("user.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 User deserializedUser = (User) in.readObject();
	         
			 System.out.println(deserializedUser);
			 
		} 
		catch (Exception e) 
		{
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
	}

}
