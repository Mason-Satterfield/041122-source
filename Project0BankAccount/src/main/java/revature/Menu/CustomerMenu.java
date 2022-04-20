package revature.Menu;

import java.util.Scanner;

public class CustomerMenu {
	
	static int option;
	static Scanner input = new Scanner(System.in);
	
	public static void registrationMenu() {
		
	}
	
	public static void customerMenu() {
		System.out.println("Please enter your username");
		String username = input.nextLine();
		System.out.println("Please enter your password");
		String password = input.nextLine();
		//if username and password are correct
			CustomerMenu.options();
	}
	
	public static void options() {
		do {
        	System.out.println("Please enter the number for which part of application you wish to use \n1. Apply to open a new Account \n2. Apply to open a new Joint account \n3. View/Edit an Account \n4. View/Edit a Joint Account \n5. Log out");
            option = input.nextInt();
	        switch(option) {
	        	case 1: 
	        		
	        		break;
	        	case 2:
	        		
	        		break;
	        	case 3:
	        		
	        		break;
	        	case 4:
	        		
	        		break;
	        	case 5:
	        		System.out.println("You are now logged out!");
	        		break;
	        	default: 
	        		System.out.println("The number you entered was not between 1-5, please try again");
	        		break;
	        }
        }
        while (option != 5);
		
	}
}
