package com.dev.threads;

public class Thread4 extends Thread{

	Printer p;
	
	public Thread4(Printer pref)
	{
		p=pref;
	}
	@Override
	public void run()
	{
		try {
			Thread.currentThread().sleep(200); // if we don't use sleep or join o/p changes everytime its executed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.printValue(10, "Thread 4");
	}
	
}
