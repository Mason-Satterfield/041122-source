package com.revature.work;

public class Driver {

	public static void main(String[] args) {
		
		//created a new instance of cow object with named peggy
		Cow peggy = new Cow();
		
		//adding attributes to the peggy object
		peggy.weight = 500;
		peggy.age = 8;
		peggy.color = "brown";
		peggy.number_of_spots = 0;
		peggy.fav_food = "grass";
		
		//testing attributes
		System.out.println("Peggy weighs " +peggy.weight+ " pounds. Peggy is " +peggy.age+ " years old. Peggy is the color " +peggy.color+ ". Peggy has " +peggy.number_of_spots+ " number(s) of spots. Peggy's fav food is " +peggy.fav_food+ ".");
		
		//created a new instance of bird object with named ralph
		Bird ralph = new Bird();
		
		//adding attributes to the ralph object
		ralph.weight = 10;
		ralph.age = 3;
		ralph.color = "blue";
		ralph.number_of_feathers = 100;
		ralph.beak_color = "yellow";
		
		//testing attributes
		System.out.println("Ralph weighs " +ralph.weight+ " pounds. Ralph is " +ralph.age+ " years old. Ralph is the color " +ralph.color+ ". Ralph has " +ralph.number_of_feathers+ " number(s) of feathers. Ralph's beak color is " +ralph.beak_color+ ".");
		
		//cow subclass overrides animal class eat method
		peggy.eat();
		
		//bird subclass overloading animal class food method
		ralph.food("seeds", "worms");
		
		ralph.food("plants");

	}

}
