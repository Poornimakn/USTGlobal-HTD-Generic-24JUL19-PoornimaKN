package com.dev.assignment;

public class FindSum {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60,70};
		int mid=(a.length-1)/2;
		int last=(a.length-2);
		int sum=a[0]+a[mid]+a[last];
		System.out.println(sum);

	}
}
