package hello;

import com.mason.dl.PokemonTrainerDAO;

public class helloMain {
	
	int x;
	
	//this is the constructor that creates an instance of the helloMain class	
	public helloMain(){
		
		x = 5;
		
	}
	
	//created a method that is static with a void return type called myMethod
	static void myMethod() {
		
		System.out.println("My cat is fluffy");
		
	}
	
	public static void main(String[] args) {
		//this line is our integer named with a value of 25
		/*int i = 15;
		
		//this is an if control statement
		if(i > 20) {	
			System.out.println("Hello World");
		}else {
			System.out.println("i is not greater than 20");
		}
		
		//this is a while control statement
		while(i > 20) {
			System.out.println("I like dogs");
			i--;
			
		}*/
		
		//calls the myMethod to run
		myMethod();
		PokemonTrainerDAO.addTrainer();

	}

}
