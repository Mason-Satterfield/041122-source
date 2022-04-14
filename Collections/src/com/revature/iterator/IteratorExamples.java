package com.revature.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamples {
	
	static Set<String> stringSet = new HashSet<String>();
	
	public static void show() {
		
		stringSet.add("Wow!");
		stringSet.add("Woah!");
		stringSet.add("Jeez!");		
		
		//spawn an iterator using .iterator()
		Iterator<String> it = stringSet.iterator();
		
		//using a while loop, we iterate until .hasNext() returns false
		while(it.hasNext()) {
			//in order to move to the next element and get it we use .Next()
			String s = it.next();
			System.out.println(s);
		}
	}
}
