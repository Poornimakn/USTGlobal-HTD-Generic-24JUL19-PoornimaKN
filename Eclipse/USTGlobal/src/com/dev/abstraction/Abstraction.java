package com.dev.abstraction;

public class Abstraction extends AbstractExample{ //inorder to extend abstractExample its method should be overridden

	public Abstraction()
	{
		System.out.println("Constructor of Abstraction");
	}
	
	
	@Override
	void display() {
		System.out.println("Implemented method of abstract class");
		
	} 
	@Override
	void print()
	{
		System.out.println("This is print method of abstract class");
	}
	public static void main(String[] args) {
		
		Abstraction ab= new Abstraction();
		ab.display();
		ab.print();
		ab.show();
	}
	
}
