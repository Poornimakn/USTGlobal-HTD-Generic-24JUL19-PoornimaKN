package com.dev.methods;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area=Method.calcArea(2);
		System.out.println("area of"+area);
	}
	public static int avg(int x, int y, int z) {
		int avg=(x+y+z)/2;
		return avg;
	}
	public static double triangle(int b,int h)
	{
		double tri=(b*h)/2;
		return tri;
	}
	public static double circle(int r)
	{
		double cir=3.14*r*r;
		return cir;
	}
	

}
