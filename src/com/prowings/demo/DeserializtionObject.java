package com.prowings.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializtionObject {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("Demo.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(in.available() == 0)
			{
				Object o = in.readObject();
				if(o instanceof Teacher)
				{
					Teacher t = (Teacher)o;
					System.out.println(t);
					break;
				}
				System.out.println("Outside while!!!");
			}
					
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
