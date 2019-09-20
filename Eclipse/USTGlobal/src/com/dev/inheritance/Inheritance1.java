package com.dev.inheritance;

public class Inheritance1 extends Inheritance {

	static Inheritance1 i1=new Inheritance1();
	String name="Eddard";
	
	@Override
	public void printName()
	{
		System.out.println(name+ " "+super.name+" "+lastName);
		super.printName();
	}
	public static void main(String[] args) {
		
		i1.printName();
		
	}

}
