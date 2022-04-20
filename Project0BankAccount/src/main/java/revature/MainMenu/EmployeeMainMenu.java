package revature.MainMenu;

import java.util.Scanner;

import revature.Menu.EmployeeMenu;

public class EmployeeMainMenu {
	
	static Scanner input = new Scanner(System.in);
	
	public static void employeeMenu(){
		System.out.println("Please enter your username");
		String username = input.nextLine();
		System.out.println("Please enter your password");
		String password = input.nextLine();
		//sign in the employee and verify the username and password match
		//if username and password are correct
			EmployeeMenu.employeeMenu();
	}
}
