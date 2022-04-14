package com.revature.collections;

import com.revature.generic.MyGenericClass;
import com.revature.generic.Vehicle;
import com.revature.iterator.IteratorExamples;

public class Driver {

	public static void main(String[] args) {
		ListExamples.show();
		
		QueueExamples.show();
		
		SetExamples.show();
		
		MapExample.show();
		
		IteratorExamples.show();
		
		MyGenericClass<Object> objectGeneric = new MyGenericClass<Object>(new Object());
		objectGeneric.showPayload();
		
		MyGenericClass<String> stringGeneric = new MyGenericClass<String>("Hello!");
		stringGeneric.showPayload();
		
		Vehicle v = new Vehicle("Ford", "Ranger", "1997");
		MyGenericClass<Vehicle> vehicleGeneric = new MyGenericClass<Vehicle>(v);
		vehicleGeneric.showPayload();
	}

}
