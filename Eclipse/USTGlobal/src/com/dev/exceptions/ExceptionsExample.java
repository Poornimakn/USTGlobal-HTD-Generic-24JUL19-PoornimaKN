package com.dev.exceptions;

public class ExceptionsExample {
	
	public static void main(String[] args) {

	double d = 10.0;
	double q = 0.0;
	System.out.println("Result "+ d/q);
	System.out.println("Result "+q/d);
	
	System.out.println("Print Statement before"); //stops here cz there is an exception in nxt line
//	StringBuffer sb= new StringBuffer(-1); 
//	System.out.println(sb);
	t();
	System.out.println("Print Statement After");
	}
	public static void s()
	{
		StringBuffer sb= new StringBuffer(-1); 
	}
	public static void t()
	{
		s();
	}
}
