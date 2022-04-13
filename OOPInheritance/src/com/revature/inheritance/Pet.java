package com.revature.inheritance;

//I am the parent class
public class Pet {
	//these are attributes
	String size;
	String sound;
	String treats;
	
	public void sleep() {
		System.out.println("ZZZzz");
	}
	
	//this method is overloaded in the parent
	public void treats(String treats) {
			System.out.println("My pet likes " +treats);
	}
}
