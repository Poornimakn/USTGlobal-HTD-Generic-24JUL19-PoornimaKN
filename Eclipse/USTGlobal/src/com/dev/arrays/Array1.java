package com.dev.arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		int index=2,c=0,mid=(1+(arr.length-1))/2;
		int last;
		if(index<=arr.length-1)
		{
			System.out.println("Index is present");
			for(int i=0;i<=index;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		else
		{
			System.out.println("Index is not Present");
		}
		System.out.println("Middle Element is "+arr[mid]);
		
	}

}
