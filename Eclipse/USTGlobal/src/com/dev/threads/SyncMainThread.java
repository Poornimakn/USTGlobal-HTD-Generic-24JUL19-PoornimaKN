package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("SyncMain Thread Started");

		Printer p = new Printer(); //whenever 2 or more threads are trying to use single resource then it is known as race condition leads to data inconsistency
		
		Thread4 t4= new Thread4(p);
		t4.start();
		t4.join(); // see thread4 for its use
		
		new Thread5(p).start();

//		for(int i=0;i<=10;i++)
//			System.out.println("i = "+i);

		System.out.println("SyncMain Thread Terminated");

	}

}
