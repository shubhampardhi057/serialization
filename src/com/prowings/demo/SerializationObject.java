package com.prowings.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationObject  {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10,"Shubham","Pune");
		Teacher t1 = new Teacher(101, "RAM","Ayodya");
		
		try {
			
			FileOutputStream file = new FileOutputStream("Demo.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(s1);
			out.writeObject(t1);
			
			System.out.println("object serialize successfully!!!!");
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			
		}
	}

}
