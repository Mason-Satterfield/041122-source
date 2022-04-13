package com.revature.work;

public class Bird extends Animal{
	int number_of_feathers;
	String beak_color;
	
	//overloaded method
	public void food(String s, String p) {
		System.out.println("I am bird that loves to eat " +s+ " and " +p);
	}
}
