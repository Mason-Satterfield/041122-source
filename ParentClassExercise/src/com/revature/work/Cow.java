package com.revature.work;

public class Cow extends Animal{
	
	int number_of_spots;
	String fav_food;
	
	//overridden method
	public void eat() {
		System.out.println("I am a cow and I only like grass");
	}
}
