package com.dev.threads;

public class Thread2 extends Thread{ // inheritance T2 is a thread
	
	@Override
	public void run()
	{
		System.out.println("T2 thread Started");
		
		for(int j=0;j<=10;j++)
			System.out.println("j = "+j);
		
		System.out.println("T2 thread Ended");
	}

}
