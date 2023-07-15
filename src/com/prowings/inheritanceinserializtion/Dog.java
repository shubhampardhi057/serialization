package com.prowings.inheritanceinserializtion;

public class Dog extends Animal {

	int j = 20;
	
	Dog(){
		
		System.out.println("Inside no-arg constuctor !!!");
	}
	
	Dog(int j){
		
		System.out.println("Inside 1-arg constuctor !!!");
	}

	@Override
	public String toString() {
		return "Dog [j=" + j + ", i=" + i + "]";
	}

	
	
	
	
	
	
	
}
