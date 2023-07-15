package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializationDemoWithTransient {
	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream file = new FileInputStream("TransientStudent.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			
			Student2 desrializedstd1 = (Student2) in.readObject();
			
			System.out.println(desrializedstd1);
			
			System.out.println(desrializedstd1.schoolName);
		}
		catch (Exception e) 
		{
			System.out.println("Exception while Desrialization object !!!"+e.getMessage());
			
			e.printStackTrace();
			
		}
	}

}
