package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingMultipleObjects {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(102,"Ram");
		
		Teacher t1 = new Teacher(103,"Sham","English");
		
		try
		{
			FileOutputStream file = new FileOutputStream("ManyObject.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(s1);
			out.writeObject(t1);
			
			System.out.println("object serialized successfully !!!!");
		}
		catch (Exception e)
		{
			System.out.println("exception while serializing the objects !! :"+e.getMessage());
			
			e.printStackTrace();
		}
		
		
	}

}
