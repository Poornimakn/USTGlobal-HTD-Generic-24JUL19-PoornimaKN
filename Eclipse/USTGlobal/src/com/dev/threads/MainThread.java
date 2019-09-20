package com.dev.threads;

public class MainThread {
	
	public static void main(String[] args) {
		
	
	System.out.println("Main thread Started...");
	
	System.out.println("Main Thread Class prints value of i ");
	
	Thread2 t2= new Thread2();
	t2.setName("thread T2"); //setters
	t2.setPriority(10);
	t2.start();
	
	
	Thread3 t3 = new Thread3();
	Thread t = new Thread(t3);
	t.start();
	
	Thread.currentThread().setName("Main Thread"); // name for this main method
	for(int i=0;i<=10;i++)
		System.out.println("i = "+i);
	
	System.out.println("Thread Name: "+t2.getName()); // getters
	System.out.println("This Name: "+Thread.currentThread().getName());
	System.out.println("Thread2 id: "+t2.getId());
	System.out.println("Thread3 id: "+t.getId());
	System.out.println("Thread2 priority: "+t2.getPriority());
	System.out.println("Main thread id: "+Thread.currentThread().getId());
	
	
	System.out.println("Main thread Ended...");
	
	}
}
