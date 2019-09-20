package com.dev.searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] array= {10,2,3,4,5};
		boolean result=contains(array,2);
		boolean result1=contains(array,20);
		System.out.println("Array1 contains value? "+result);
		System.out.println("Array1 contains value? "+result1);

	}
	public static boolean contains(int[] arr,int value)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
				return true;
		}
		return false;
	}

}
