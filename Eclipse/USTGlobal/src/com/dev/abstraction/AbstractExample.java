package com.dev.abstraction;

public abstract class AbstractExample { //abstract class

//	abstract void display()
//	{
//		we cannot have body for abstract method.
//	}
	
	public AbstractExample()
	{
		System.out.println("Constructor of abstract class");
	}
	void print()
	{
		System.out.println("This is print method of abstract class");
	}
	abstract void display();
	public void show() {
		System.out.println("Concrete Method of abstract class");
	}
	
}
