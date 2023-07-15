package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemoWithTransient {
	
	public static void main(String[] args) {
		
		Student2 std1 = new Student2(123,"Ram",90);
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			
			file = new FileOutputStream("TransientStudent.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(std1);
			System.out.println("Object serialized successfully !!!");
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception while serializing the object "+e.getMessage());
			e.printStackTrace();
		}
		finally {
			
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
