package com.revature.otherpackage;

public class Parent {
	
	private int privateInt = 5;
	
	
	public int getPrivateInt() {
		return privateInt;
	}
	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}
	
	protected int protectedInt = 16;
	int defaultInt = 2;
	public int publicInt = 7;
}
