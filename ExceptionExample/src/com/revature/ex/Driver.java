package com.revature.ex;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		//this is example of a try/catch block
		//the try statement lets you execute a block of code for the sake of testing for errors
		try {
			//block of code we want to try
			int[] partyPokemon = {1, 2, 3, 4, 5, 6};
			System.out.println(partyPokemon[8]);
		}
		//the exception we want to catch, in this case we are catching an IndexOutOfBounds Exception
		catch (Exception e){
			System.out.println("A party can only have 6 pokemon");
		}
		//the finally statement executes a line of code after the try/catch blocks, no matter the result
		finally {
			System.out.println("The finally statement has ran");
		}
		
		//this is how we create an object to take in user input
		Scanner input = new Scanner(System.in);
		
		//give user a question to answer
		//System.out.println("How many pokemon are in your party?");
		
		//reads input and puts that integer into the part int variable
		//int party = input.nextInt();
		
		//we are passing the party variable as our parameter for the checkPartySize method
		//myException.checkPartySize(party);
		
		System.out.println("Who is your favorite pokemon");
		
		//reads input and puts the String into the part String variable
		String partyname = input.nextLine();
		
		System.out.println("My favorite Pokemon is " +partyname);
		
	}
}
