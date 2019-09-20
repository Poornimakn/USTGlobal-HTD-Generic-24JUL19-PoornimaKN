package com.dev.methods;

public class Method {
	
	public static int j=0; //public needs to be written if we need to use this var in another package	
	static Method me=new Method();
	public static void main(String[] args) {
		
		int area=calcArea(6); //var created inside a method will be applicable only for this method.
		System.out.println("Area is "+area);//type Sout then  ctrl+space sop will come.
		int avg=Method2.avg(2,3,4);
		System.out.println("Average is "+avg);
		double tri=Method2.triangle(2,3);
		System.out.println("Area of Triangle "+tri);
		double cir=Method2.circle(3);
		System.out.println("Are of circle "+cir);
		
		j=calcArea(6);
		System.out.println("Area of square is "+j);
		
		int rec=me.areaRec(2,3);
		System.out.println("Area of rectangle is "+rec);
		
		int z=calculateArea(2);
		System.out.println(z);
		
		int y=calcA(8);
		System.out.println(y);
		
	}
	public static int calcArea(int side) { //method should be written inside the scope of the class 
//		int area=side*side; //area in psvm doesn't effect this.
//		return area;
//		int j=side*side;// can be again declared
		j=side*side;
		int n=me.areaRec(3,2);
//		System.out.println(n);
		return j;
	}
	public int areaRec(int len,int width)
	{
		int area=len*width;
		return area;
	}
	
	protected static int calculateArea(int s)
	{
		int area=s*s;
		int n=me.calculateArea(3);
		return area;
		
	}
	static int calcA(int b)//cannot be accessed by other packages
	{
		int area=b*b;
		return area;
	}
	final void print()
	{
		System.out.println("This is print()");
	}
}
