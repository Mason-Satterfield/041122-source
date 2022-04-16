package com.revature.stringbuilder;

public class Driver {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello "); 
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
		StringBuilder sb11=new StringBuilder("Hello");  
		sb11.replace(1,3,"Java");  
		System.out.println(sb11);//prints HJavalo 
		
		StringBuilder sb2=new StringBuilder("Hello");  
		sb2.delete(1,3);  
		System.out.println(sb2);//prints Hlo 
		
		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.reverse();  
		System.out.println(sb3);//prints olleH  
	}

}
