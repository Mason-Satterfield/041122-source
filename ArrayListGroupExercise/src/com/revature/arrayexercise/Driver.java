package com.revature.arrayexercise;

public class Driver {

	public static void main(String[] args) {
		MyArrayList<String> myArrayList= new MyArrayList<>();
		
		myArrayList.add("0");
		myArrayList.add("1");
		myArrayList.add("2");
		myArrayList.add("3");
		myArrayList.add("4");
		myArrayList.add("5");
		myArrayList.add("6");
		myArrayList.add("7");
		myArrayList.add("8");
		myArrayList.add("9");
		myArrayList.add("10");
		myArrayList.add("11");
		
		System.out.println(myArrayList.toString());
		
		System.out.println(myArrayList.get(9));
	}

}
