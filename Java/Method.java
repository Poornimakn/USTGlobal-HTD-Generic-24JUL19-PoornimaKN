public class Method{
	public static int squareArea(int side)
	{
		int area= side*side;
		return area;
	}
	public static double circleArea(double r)
	{
		double circum= 3.15*r*r;
		return circum;
	}
	public static double triArea(double b,double h)
	{
		double triarea=(b*h)/2;
		return triarea;
	}
	public static int avg(int x,int y,int z)
	{
		int avg= (x+y+z)/2;
		return avg;
	}
	public static void main(String[] args) {
		int c=squareArea(5);
		double a=circleArea(5);
		double b=triArea(2,3);
		int d=avg(1,2,3);
		System.out.println("Area of Square is "+c);
		System.out.println("Area of Circle is "+a);
		System.out.println("Area of Triangle is "+b);
		System.out.println("Aveg is "+d);
	}
}