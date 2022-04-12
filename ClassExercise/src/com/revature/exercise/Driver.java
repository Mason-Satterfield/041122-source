package com.revature.exercise;

public class Driver {
	
	public static void main(String[] args) {
		int i = 16;
		try {
			functionThatThrowsException(i);
		}
		catch(ExtendedClass c) {
			System.out.println(c);
		}
	}
	
	public static void functionThatThrowsException(int i) throws ExtendedClass {
		if (i > 15) {
			throw new ExtendedClass(i);	
		}	
	}

}
