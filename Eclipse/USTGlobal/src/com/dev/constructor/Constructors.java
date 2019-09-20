package com.dev.constructor;

public class Constructors {
	
	public Constructors()
	{
		System.out.println("This is no arg constructor");
	}
	public Constructors(int i)
	{
		System.out.println("This is Constructor with int arg");
	}
	public Constructors(String s)
	{
		System.out.println("This is constructor with string arg");
	}
	public Constructors(String s,int i)
	{
		System.out.println("This is constructor with string and int arg");
	}
	public Constructors(int i,String s)
	{
		System.out.println("This is constructor with int and int string");
	}

	public static void main(String[] args) {
		
		Constructors ce= new Constructors();
		Constructors ce1= new Constructors(1);
		Constructors ce2= new Constructors("p");
		Constructors ce3= new Constructors("p",2);
		Constructors ce4= new Constructors(2,"p");
		
	}

}
