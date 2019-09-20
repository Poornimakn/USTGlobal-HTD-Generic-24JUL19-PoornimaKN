package com.dev.polymorphism;

public class Polymorphism2 extends Polymorphism{
	
	static Polymorphism2 p2=new Polymorphism2();
	String name="Inchu";
	
	@Override
	public void display()
	{
		System.out.println("Name = "+name+" "+p1.name);
	}

	public static void main(String[] args) {
		
		p2.display();
		p2.add(2,4);
	}

}
