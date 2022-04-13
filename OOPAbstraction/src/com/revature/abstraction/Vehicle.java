package com.revature.abstraction;

public class Vehicle implements Comparable<Vehicle>{
	
	public String make;
	public String model;
	public String year;
	
	@Override
	public String toString() {
		return year + " " +make+ " " +model;
	}

	@Override
	public int compareTo(Vehicle other) {
		
		//compares two items and swaps. if theres a swap the sort will have to run again to check the swap did not change anything
		return year.compareTo(other.year);
	}
	
	
}
