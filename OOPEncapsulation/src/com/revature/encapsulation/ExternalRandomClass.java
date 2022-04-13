package com.revature.encapsulation;

import com.revature.otherpackage.Parent;

public class ExternalRandomClass {
	public void testVisibility() {
		Parent p = new Parent();
		//p.privateInt = 900; //Never visibile
		//p.protectedInt = 600; // Not visible because not a child nor does it share a package with Parent
		//p.defaultInt = 400; //Not visible because a package is not the same as the Parent
		p.publicInt = 100; //Always visible
	}
}
