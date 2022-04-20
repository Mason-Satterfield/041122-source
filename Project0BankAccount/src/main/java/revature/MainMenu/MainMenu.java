package revature.MainMenu;

import java.util.Scanner;

public class MainMenu {
	
	static int whichApp;
	static Scanner input = new Scanner(System.in);
	
	public static void mainMenu(){
		System.out.println("Welcome to Revature Bank");
        
		do {
        	System.out.println("Please enter the number for which part of application you wish to run \n1. Customer \n2. Employee \n3. Bank Admin \n4. Exit Application");
            whichApp = input.nextInt();
	        switch(whichApp) {
	        	case 1: 
	        		CustomerMainMenu.customerMenu();
	        		//to end the customer session, it will display the ending message in the customer menu
	        		whichApp = 4;
	        		break;
	        	case 2:
	        		EmployeeMainMenu.employeeMenu();
	        		break;
	        	case 3:
	        		BankAdminMainMenu.bankAdminMenu();
	        		break;
	        	case 4:
	        		System.out.println("Thank you for choosing Revature Bank");
	        		break;
	        	default: 
	        		System.out.println("The number you entered was not between 1-4, please try again");
	        		break;
	        }
        }
        while (whichApp != 4);
	}
}
