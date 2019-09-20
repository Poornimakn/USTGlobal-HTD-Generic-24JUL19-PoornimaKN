package com.dev.inheritance;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		byte b=10;
		int i=20;
		byte c=(byte) i;
		System.out.println(c);
		
		byte a=30;
		int d=a; //implicit casting
		System.out.println(d);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int j = scan.nextInt();
		
		System.out.println(j);
		
		
	}

}
