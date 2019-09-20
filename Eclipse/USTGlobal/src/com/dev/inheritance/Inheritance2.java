package com.dev.inheritance;

public class Inheritance2 extends Inheritance1 {

	static Inheritance2 i2= new Inheritance2();
	
	
	public void printName() {
		String name="Sansa";
		System.out.println(name+ " "+i2.name+ " "+i2.lastName);
	}
	public static void main(String[] args) {
		i2.printName();
	}

}
