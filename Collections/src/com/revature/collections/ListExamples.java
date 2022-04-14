package com.revature.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	// You can declare variables with an Interface type
	static List<String> strings;
	
	public static void show() {
		//but you cannot instantiate them ex: 
		//strings = new List<String>();
		
		//Instead, you must instantiate a type that implements the interface
		strings = new ArrayList<String>();
		
		//if we want a string
		strings.add("Hello");
		
		//we can also remove elements by index or value. this will then push the 1st position to the 0th position
		//strings.remove(0);
		//strings.remove("Hello");
		
		//to retrieve values, use get with an index
		String s = strings.get(0);
		
		s = "Goodbye";
		
		System.out.println(strings.get(0));
		
		//to change an element at a particular index we use set
		strings.set(0, "Goodbye!");
		
		System.out.println(strings.get(0));
	}
}
