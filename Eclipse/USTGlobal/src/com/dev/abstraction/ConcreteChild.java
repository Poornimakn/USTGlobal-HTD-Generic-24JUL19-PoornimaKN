package com.dev.abstraction;

public class ConcreteChild extends ChildAbstract{

	@Override
	void show() {
		System.out.println("This is show() of Concretechild");
		
	}
	public static void main(String[] args) {
		ConcreteChild c=new ConcreteChild();
		c.add();
		c.print();
		c.show();
	}
	

}
