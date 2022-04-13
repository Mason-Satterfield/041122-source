package com.revature.inheritance;

//I am the child class
public class Dog extends Pet{
		//the attributes
		String color;
		String hairlength;
		String food;
		//this method overrides out sleep method in the parent class (Pet)
		public void sleep() {
			System.out.println("Hey, I am trying to sleep!");
		}
		public void treats(String treats, String food) {
			System.out.println("My pet likes " +treats+ " and " +food);
		}
}
