package com.dev.methods;

public class MethodOverloading1 {
	
	static MethodOverloading1 m1=new MethodOverloading1();
	
	
	public int addition(int i,int j)
	{	
		int add=i+j;
		return add;
	}
	public int addition(int i,int j,int k)
	{	
		int add=i+j+k;
		return add;
	}
	public int addition(int i,int j,int k,int l)
	{	
		int add=i+j+k+l;
		return add;
	}
	public int substraction(int i,int j)
	{
		int sub=i-j;
		return sub;
	}
	public int substraction(int i,int j,int k)
	{
		int sub=i-(j-k);
		return sub;
	}
	public int substraction(int i,int j,int k,int l)
	{
		int sub=(i-j)-(k-l);
		return sub;
	}
	public int multiplication(int i,int j)
	{
		int mul=i*j;
		return mul;
	}
	public int multiplication(int i,int j,int k)
	{
		int mul=i*j*k;
		return mul;
	}
	public int multiplication(int i,int j,int k,int l)
	{
		int mul=i*j*k*l;
		return mul;
	}
	public float division(float i,float j)
	{
		float div=j/i;
		return div;
	}
	public float division(float i,float j,float k)
	{
		float div=(j/i)/k;
		return div;
	}
	public float division(float i,float j,float k,float l)
	{
		float div=(j/i)/(k/l);
		return div;
	}
	

	public static void main(String[] args) {
		int add=m1.addition(20,40);
		System.out.println(add);
		
//		int sub=m1.substraction(20,40);
//		System.out.println(sub);
//		
//		int mul=m1.multiplication(20,40);
//		System.out.println(mul);
//
//		float div=m1.division(20,40);
//		System.out.println(div);
	}

}
