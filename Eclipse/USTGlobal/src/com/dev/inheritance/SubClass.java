package com.dev.inheritance;

public class SubClass extends SuperClass {
	
	static SubClass sc= new SubClass();
//	String name="poorni";
//	@Override
	public SubClass()
	{
		super("p",12);//compiler implicitly calls super even if there is a super statement therefore no arg constructor of superclass along with this super will be executed
//		System.out.println("User Name is "+name+ " Author name is "+super.name);
	}
	
	public static void main(String[] args) {
		
//		sc.SubClass();
	}
	
	

}
