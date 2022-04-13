package com.revature.otherpackage;

public class Child extends Parent{
	
	public void testVisibility() {
		/* Never visible
		privateInt = 10;*/
		protectedInt = 6; //Visible because its a child class and in the same package as Parent
		defaultInt = 9; //Visible because this class is in the same package as Parents
		publicInt = 11; //Always visible
	}
}
