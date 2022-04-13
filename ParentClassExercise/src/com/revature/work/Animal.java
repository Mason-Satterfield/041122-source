package com.revature.work;

public class Animal {

	int weight;
	int age;
	String color;
	
	//parent method eat
	public void eat() {
		System.out.println("I am an animal and I eat anything");
	}
	
	//parent method food
	public void food(String s) {
		System.out.println("I am an animal that loves to eat " +s);
	}
}
