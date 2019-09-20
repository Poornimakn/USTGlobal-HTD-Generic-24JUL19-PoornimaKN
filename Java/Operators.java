public class Operators{
	public static void main(String[] args) {
		int a=10;
		int b=20;

		int c = a+b;//arithmetic operator
		System.out.println("c= "+c);

		int d=50;
		d+=b;//assignment operator
		System.out.println("d= "+d);

		int e=10;
		int f=++e;//increment operator
		System.out.println("f= "+f);

		boolean g=a>b;//Relational Operator
		System.out.println("g= "+g);

		boolean x=true;
		boolean y=false;
		boolean z=x&&y;//Logical Operator
		System.out.println("z= "+z);

		byte i=3;
		byte j=4;
		int k=i|j;//Bitwise operator
		System.out.println("k= "+k);
	}
}