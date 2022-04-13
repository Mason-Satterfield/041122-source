package com.revature.inheritance;

public class Driver {

	public static void main(String[] args) {
		
		//dog object instanced
		Dog beagle = new Dog();
		
		//from its class
		beagle.color = "brown";
		
		//Dog object inheriting size from parent class
		beagle.size = "small";
		
		beagle.hairlength = "short";
		beagle.sound = "bark bark";
		
		
		System.out.println("The beagle is " + beagle.color + " and " + beagle.size + ".");
		
		Cat tabby = new Cat();
		tabby.color = "brown";
		tabby.favoriteFood = "tuna";
		tabby.size = "small";
		tabby.sound = "meow meow";
		
		System.out.println("The cat says " + tabby.sound);
		tabby.sleep();
		beagle.sleep();
		
		//calls subclass (Dog) overloaded method
		beagle.treats("Beggin Strips", "kibble");
		//calls parents (Pet) overloaded method
		beagle.treats("bacon");
	}

}
