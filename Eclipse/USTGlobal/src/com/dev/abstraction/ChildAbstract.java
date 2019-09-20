package com.dev.abstraction;

public abstract class ChildAbstract extends Abstract {

	@Override
	public void print() {
		System.out.println("This is print() of ChildAbstract");
	}
	abstract void show();
}
