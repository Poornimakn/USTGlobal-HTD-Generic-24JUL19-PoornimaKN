package com.dev.polymorphism;

public class Polymorphism {
	
	static Polymorphism p1=new Polymorphism();
	
	String name="Poorni";
	
	public void display()
	{
		System.out.println("Name = "+name);
	}
	public int add(int i,int j)
	{
		int add=i+j;
		System.out.println("Sum of 2 number is "+add);
		return add;
	}
	public int add(int i,int j,int k)
	{
		int add=i+j+k;
		System.out.println("SUm of 3 number is "+add);
		return add;
	}
	public static void main(String[] args) {
		
		p1.display();
		p1.add(2,3);
		p1.add(2,3,4);

	}

}
