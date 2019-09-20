package com.dev.constructor;

import com.dev.methods.Method;//to import methods present in another package 

public class Demo {

	public static void main(String[] args) {
		
		int i =Method.calcArea(4);
		System.out.println("area"+i);
		System.out.println(Method.j);
		
//		int a=Method.calculateArea(5);
//		System.out.println(a);

	}

}
