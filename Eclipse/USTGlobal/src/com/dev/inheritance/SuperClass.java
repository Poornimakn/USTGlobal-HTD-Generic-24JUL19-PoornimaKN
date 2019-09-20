package com.dev.inheritance;

public class SuperClass extends SuperMost {
	
	static SuperClass sc= new SuperClass();

//	 String name="Aptitude";
//	
//	 @Override
//	 public void display()
//	{
//			System.out.println("Book Name is "+name+ " Author name is "+super.name);
//	}
//	 
	public static void main(String[] args) {
				sc.display();

	}
	public SuperClass() {
		System.out.println("Const with no arguments of SuperClass ");
	}
	public SuperClass(int i) {
		System.out.println("Const with int arguments ");
	}
	public SuperClass(String s) {
		System.out.println("Const with string arguments ");
	}
	public SuperClass(String s,int i) {
		System.out.println("Const with String and int arguments ");
	}
	public SuperClass(int i,String s) {
		System.out.println("Const with int and String arguments ");
	}
	
}
