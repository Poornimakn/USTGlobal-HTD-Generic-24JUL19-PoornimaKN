package com.dev.constructor;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("c");
		System.out.println("This is no arg constructor");
	}
	public Constructor(int i)
	{
		System.out.println("c1");
		System.out.println("This is Constructor with int arg");
	}
	public Constructor(String s)
	{
		System.out.println("c2");
		System.out.println("This is constructor with string arg");
	}
	public Constructor(String s,int i)
	{
		System.out.println("c3");
		System.out.println("This is constructor with string and int arg");
	}
	public Constructor(int i,String s)
	{
		System.out.println("c4");
		System.out.println("This is constructor with int and string");
	}
	public static void main(String[] args) {
		
		Constructor c= new Constructor();
		Constructor c1= new Constructor(2);
		Constructor c2= new Constructor("p");
		Constructor c3= new Constructor("p",2);
		Constructor c4= new Constructor(2,"p");
	}

}
