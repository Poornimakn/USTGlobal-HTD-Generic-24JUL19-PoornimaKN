package com.dev.abstraction;

@FunctionalInterface
public interface Abs extends Interface2{
	
	  void display();
	  
//	  void show(); cannot be declared cz this is functional interface and wont allow more than 1 abstract method.
	  int i=2;
	  
//	  public default void print()
//	  {
//		  System.out.println("A"); //we should call default method by creating object in the class
//	  }
	  
	  public static void print()
	  {
		  System.out.println("A");
	  }
}
