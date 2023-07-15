package com.prowings.inheritanceinserializtion;

import java.io.Serializable;

public class Animal implements Serializable {
	
	int i = 10;
	
	Animal(){
		
		System.out.println("Inside no-arg constuctor !!!");
	}
	
	Animal(int i){
		
		System.out.println("Inside 1-arg Constuctor !!!");
	}

	@Override
	public String toString() {
		return "Animal [i=" + i + "]";
	}

	
	
}
