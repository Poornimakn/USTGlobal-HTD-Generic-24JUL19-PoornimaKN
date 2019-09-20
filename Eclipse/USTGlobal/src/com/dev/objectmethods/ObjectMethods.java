package com.dev.objectmethods;

public class ObjectMethods {

	public static void main(String[] args) {
		
		Encapsulation e1= new Encapsulation();
		Encapsulation e2 =new Encapsulation();
		
		System.out.println(e1.getClass());
		System.out.println(e2.getClass());
		
		//Encapsulation e3= e1.   //we have implement cloneable interface to use clone method otherwise it will an exception
		
	}

}
