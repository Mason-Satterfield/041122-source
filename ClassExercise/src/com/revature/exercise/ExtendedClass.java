package com.revature.exercise;

public class ExtendedClass extends Exception{
	
	public ExtendedClass(int i) {
		super("The number " + i + " is too high!");
	}
	
}
