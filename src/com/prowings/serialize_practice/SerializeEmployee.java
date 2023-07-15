package com.prowings.serialize_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Ram","Pune");
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try
		{
			// Saving Object in a file
			
			 file  = new FileOutputStream("Employee.ser");
			 out = new ObjectOutputStream(file);
			
			// Method for serializtion of object
			
		    out.writeObject(emp);
			System.out.println("object serialized successfully !!!");
			
		}
		catch (Exception e) 
		{
			System.out.println("exception while serializing the object !! :"+ e.getMessage());
			e.printStackTrace();
		}
		 finally 
		 {
			 try 
			 {
				out.close();
				file.close();
			}
			 catch (IOException e) 
			 {
				System.out.println("error while closing the resources");
				e.printStackTrace();
			}
	}
	}

}
