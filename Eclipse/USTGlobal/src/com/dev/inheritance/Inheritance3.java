package com.dev.inheritance;

public class Inheritance3 extends Inheritance1{
	
	static Inheritance3 i3=new Inheritance3();
	
	@Override
	public void printName() {
		String name="Robb";
		System.out.println(name+ " "+super.name+" " +i3.lastName);
		super.printName();
	}

	public static void main(String[] args) {
		
		i3.printName();
	}

}
