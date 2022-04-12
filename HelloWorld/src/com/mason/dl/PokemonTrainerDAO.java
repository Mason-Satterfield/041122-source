package com.mason.dl;

public class PokemonTrainerDAO {
	
	//created a method using the PokemonTrainer model
	public static PokemonTrainer addTrainer() {
		
		//this line initializes an instance of the PokemonTrainer model class
		PokemonTrainer pokemonTrainer = new PokemonTrainer();
		
		pokemonTrainer.firstName = "Mason";
		pokemonTrainer.lastName = "Satterfield";
		pokemonTrainer.age = 22;
		pokemonTrainer.typeFavorite = "Fire";
		pokemonTrainer.badges = 2;
		
		System.out.println(pokemonTrainer);
		return pokemonTrainer;
	}
}
