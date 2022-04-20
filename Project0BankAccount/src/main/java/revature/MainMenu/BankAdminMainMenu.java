package revature.MainMenu;

import java.util.Scanner;

import revature.Menu.EmployeeMenu;

public class BankAdminMainMenu {
	
	static Scanner input = new Scanner(System.in);
	
	public static void bankAdminMenu(){
		System.out.println("Please enter your username");
		String username = input.nextLine();
		System.out.println("Please enter your password");
		String password = input.nextLine();
		//sign in the bank admin and verify the username and password match
		//if username and password are correct
			EmployeeMenu.employeeMenu();
	}
}
