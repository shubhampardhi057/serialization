package com.prowings.externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerializationUsingExternalizable {
	
	public static void main(String[] args) {
		
		ExternalizedUser eusr = new ExternalizedUser("1234","Ram","password");
		

		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			file = new FileOutputStream("ext_user.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(eusr);
			
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
