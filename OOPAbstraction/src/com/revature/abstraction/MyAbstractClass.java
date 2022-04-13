package com.revature.abstraction;

public abstract class MyAbstractClass {
	
	//Can have instance variables like a normal class
	int myInt = 10;
	
	//Can have instance methods
	public void doAbstractStuff() {
		System.out.println("Wow, Im so abstract");
	}
	
	public abstract void implementMe();
}
