package com.dev.threads;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main thread Started...");
		
		for(int i=0;i<=1000000;i++)
			System.out.println("i = "+i);
		
		for(int i=0;i<=10;i++)
			System.out.println("i = "+i);
			
		System.out.println("Main thread Ended...");

	}

}
