package com.revature.homework1;
/* == is a reference comparison, i.e. both objects point to the same memory location
 * .equals() evaluates to the comparison of values in the objects
 * will only compare what it is written to compare, no more, no less. so if overridden then it will follow that class if not it will follow the object class rules
 * 
 * Hashcode is used as the bucket(Hash Table Collections term) number for storing elements of the set/map. This bucket number is the address of the element inside the set/map.
 * 
 * In the example, let's use a really simple way of doing this - the number of letters in the name of the object. So the cabbage goes in box 7, the 
 * pea goes in box 3, the rocket in box 6, the banjo in box 5 and so on. What about the rhinoceros, though? It has 10 characters, so we'll change our 
 * algorithm a little and "wrap round" so that 10-letter objects go in box 1, 11 letters in box 2 and so on. That should cover any object.
 * Sometimes a box will have more than one object in it, but if you are looking for a rocket, it's still much quicker to compare a peanut and a rocket, 
 * than to check a whole pile of cabbages, peas , banjos and rhinoceroses.
 * 
 * 
 */


public class Driver {

	public static void main(String[] args) {
		 String A = "Mason";  
	     String B = "Mason";
	     
	     if(A.equals(B)){
	    	 System.out.println("String A which is " +A+ " is equal to String B which is " +B);
	    	 System.out.println("String A hashcode is " +A.hashCode()+ " is equal to String B's hashcode which is " +B.hashCode());
	     }
	     else {
	    	 System.out.println("Somethings not right");
	     }
	     String C = "Mason";  
	     String D = "Catie";
	     
	     if(C.equals(D)){
	    	 System.out.println("Somethings not right");
	     }
	     else {
	    	 System.out.println("String C which is " +C+ " is not equal to String D which is " +D);
	    	 System.out.println("String C hashcode is " +C.hashCode()+ " is not equal to String D's hashcode which is " +D.hashCode()); 
	     }
	     
	}

}
