package revature.MainMenu;

import java.util.Scanner;

import revature.Menu.CustomerMenu;

public class CustomerMainMenu {
	
	static int customerApp;
	static Scanner input = new Scanner(System.in);
	
	public static void customerMenu() {
		do {
        	System.out.println("Please enter the number for which part of application you wish to run \n1. Register \n2. Login \n3. Exit Application");
            customerApp = input.nextInt();
	        switch(customerApp) {
	        	case 1: 
	        		CustomerMenu.registrationMenu();
	        		break;
	        	case 2:
	        		CustomerMenu.customerMenu();
	        		break;
	        	case 3:
	        		System.out.println("Thank you for choosing Revature Bank");
	        		break;
	        	default: 
	        		System.out.println("The number you entered was not between 1-3, please try again");
	        		break;
	        }
        }
        while (customerApp != 3);
	}
	
}
