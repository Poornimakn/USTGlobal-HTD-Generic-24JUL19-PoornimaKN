package com.dev.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int res=binarySearch(arr,50);
		int res1=binarySearch1(arr,0,arr.length-1,40);
		System.out.println("Position of given ele is: "+res);
		System.out.println("Position of given ele is: "+res1);

	}
	
	public static int binarySearch(int[] arr,int value)
	{
		int start = 0;
		int end= arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(value==arr[mid])
				return mid;
			if(value<arr[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	
	public static int binarySearch1(int[] arr,int low,int high,int key)
	{
		int mid=(low+high)/2;
		if(low<=high)
		{
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]<key)
				return binarySearch1(arr,mid+1,high,key);
			else
				return binarySearch1(arr,low,mid-1,key);
		}
		return -1;
	}

}
