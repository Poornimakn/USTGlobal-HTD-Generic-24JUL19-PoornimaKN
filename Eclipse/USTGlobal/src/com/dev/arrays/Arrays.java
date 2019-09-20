package com.dev.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		int[] array1;
		char []array2;
		byte array3[];
		
		//creation
		array1=new int[10];
		array2=new char[10];
		array3=new byte[10];//address of object
		
		//intialization
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		array1[4]=50;
		
		int res=array1[1]*3;//recommended
		int res1=array1[0]+10;
		System.out.println(res);//not recommended
		System.out.println(res1);
		
		array2[0]='A';
		array2[1]='B';
		array2[2]='C';
		array2[3]='D';
		array2[4]='E';
		
		int res2=array2[2]*1;
		int res3=array2[3]/2;
		System.out.println(res2);
		System.out.println(res3);
		
		array3[0]=1;
		array3[1]=2;
		array3[2]=3;
		array3[3]=4;
		array3[4]=5;
		
		int res4=array3[3]/2;
		System.out.println(res4);
		
		int[] array4=new int[5];//declaration and creation
		
		int[] array5= {20,40,60,80,100};//declaration,creation,initialization
		System.out.println(array5[2]);
		System.out.println("Length of the array "+array5.length);//length is a var
	}

}
