package com.revature.app;

public class MyObject {
	
	//THis is the CLASS scope
	static String name = "My Object";
	
	//Any non-static fields will carry data only for each individual instance
	//This is known a member field and is in the INSTANCE scope, as each instance has its own copy
	public int number = 0;
	
	public void printName() {
		System.out.println(name + ": " + number);
	}
	public void growNumber () {
		
		//Any variables declared at the top level of a method are in the METHOD scope - they belong to
		//each unique invocation of the method
		int multiplier = 2;
		
		if (multiplier > 1) {
			//this variable is in BLOCK scope, and cannot be used outside of this IF block
			int y = multiplier *2;
			number += y;
		}
	}
	
	//Regarding Var Args
	//In order to use the below, args must first be set up with data
	public void testVarArgs(String... args) {
		
		for (String s : args) {
			System.out.println(s);
		}
	}
	
	//In contrast, var args allow us to pass the data  in directly with parameters
	public void testArray(String[] args) {
		//me just checking how many values are in the length
		System.out.println(args.length);
		
		for (String s : args) {
			System.out.println(s);
		}
	}
}
