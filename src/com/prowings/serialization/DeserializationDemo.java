package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream file = new FileInputStream("Student.ser");
			ObjectInputStream in =  new ObjectInputStream(file);
			
			Student deserialsedStd = (Student)in.readObject();
			
			System.out.println(deserialsedStd);
			
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception while deserializing Stream !!!");
			
			e.printStackTrace();
			
		}
	}

}
