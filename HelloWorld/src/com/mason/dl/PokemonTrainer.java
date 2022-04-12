package com.mason.dl;

public class PokemonTrainer {
	//these are the attributes for our PokemonTrainer obj.
	String firstName;
	String lastName;
	int age;
	String typeFavorite;
	int badges;
	
	//this toString() method takes in our attributes and converts them to a string
	@Override
	public String toString() {
		return "PokemonTrainer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", typeFavorite="
				+ typeFavorite + ", badges=" + badges + "]";
	}
	
}
