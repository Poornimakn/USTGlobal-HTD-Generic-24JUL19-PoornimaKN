package com.dev.abstraction;

public class Interface implements Abs,Interface2 {

	public static void main(String[] args) {
		
		Abs.print();
		Interface i=new Interface();
		i.display();

	}

	@Override
	public void display() {
		System.out.println("Display() of Interface");
		
	}

}
