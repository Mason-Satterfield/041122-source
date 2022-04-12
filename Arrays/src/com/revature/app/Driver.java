package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		/*
		int x = 0;
		System.out.println(x++); //prints out x then increments by 1
		System.out.println(x);
		*/
		//use the below to declare a new array of 10 numbers (fixed length)
		int[] listOfNumbers = new int[10];
		// [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
		
		//sets the first element in the listOfNumbers to 15
		listOfNumbers[0] = 15; // arrays start at 0 in Java
		
		//sets value for every element in listOfNumbers
		for (int i = 0; i < listOfNumbers.length; i++) {
			listOfNumbers[i] = i;
		}
		
		//enhanced for loop; it runs its code for every element in the given data structure
		for (int element : listOfNumbers) {
			Driver.doubleValueAndPrint(element);// pick parameter if its (element) or (element, element)
		}
	}
	//if you use the same method and return type, but change the parameters, we crete an overload
	//this method multiplies by multiplier and prints it
	public static void doubleValueAndPrint(/*this is an integer parameter*/int value, int multiplier) {
		System.out.println(value * multiplier);
	}
	
	public static void doubleValueAndPrint(/*this is an integer parameter*/int value) {
		System.out.println(value * 2);
	}
}
