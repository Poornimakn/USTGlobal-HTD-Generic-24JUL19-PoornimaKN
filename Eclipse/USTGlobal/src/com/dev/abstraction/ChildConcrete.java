package com.dev.abstraction;

public class ChildConcrete extends Abstract{

	@Override
	public void print() {
		System.out.println("This is print of ChildConcrete");
		
	}
	public static void main(String[] args) {
		
		ChildConcrete cc =new ChildConcrete();
		cc.add();
		cc.print();
	}

}
