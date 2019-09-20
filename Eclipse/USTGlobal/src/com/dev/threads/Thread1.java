package com.dev.threads;

public class Thread1 {

	public static void main(String[] args) {
		
		System.out.println("Main thread Started...");
		
//		new T2().start();
		
		//or
		
		Thread2 t2= new Thread2();
		t2.start();
		
//		new Thread(new T3()).start();
		
		//or
		
		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		t.start();
		
		for(int i=0;i<=10;i++)
			System.out.println("i = "+i);
			
		System.out.println("Main thread Ended...");

	}

}
