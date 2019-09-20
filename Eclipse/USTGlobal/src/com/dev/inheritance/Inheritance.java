package com.dev.inheritance;

public class Inheritance {
	
	static Inheritance i= new Inheritance();

	String lastName ="Stark";
	String name="Torren";
	
	public static void main(String[] args) {
		
		i.printName();
		
	}
	
	public void printName() {
		
		System.out.println(name+ " "+lastName+" ");
	}

}
