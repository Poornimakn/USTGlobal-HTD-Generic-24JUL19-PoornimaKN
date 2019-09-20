package com.dev.threads;

public class PrinterSync {

	synchronized public void printValue(int i,String thread) //if we don't specify synchronized or join o/p will be unsynchronized if u dont get trty once remove join and synchronize and run it
	{
		for(int j=0;j<=i;j++)
			System.out.println("Thread: "+thread+" "+" j= "+j);
	}

	
}
