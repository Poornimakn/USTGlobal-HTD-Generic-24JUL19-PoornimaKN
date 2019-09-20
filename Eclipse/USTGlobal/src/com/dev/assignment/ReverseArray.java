package com.dev.assignment;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int a[]= {20,30,40,50,60};
		int rev=a.length-1;
		for(int i=rev;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
