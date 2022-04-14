package com.revature.generic;

public class Vehicle {
	
	public String make, model, year;
	
	public Vehicle(String make, String model, String year) {
		this.make = make;
		this.year = year;
		this.model = model;
	}
	
	public String toString() {
		return year + " " + make + " " + model;
	}

}
