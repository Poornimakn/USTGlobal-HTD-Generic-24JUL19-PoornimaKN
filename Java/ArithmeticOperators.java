public class ArithmeticOperators{
	public static void main(String[] args) {
		int i=10; //declaration and intialization
		int j=20; //declaration and intialization

		int res=i+j;//addition 
		int res1=i-j;//substraction or just res = i-j i.e., reinitialization
		int res2=i*j;//multiplication
		int res3=i/j;//division
		int res4=i%j;//modulus


		System.out.println("Addition Result = "+res);//utilization
		System.out.println("Substraction Result = "+res1);//utilization
		System.out.println("Multiplication Result = "+res2);//utilization
		System.out.println("Division Result = "+res3);//utilization
		System.out.println("Modulus Result = "+res4);//utilization

		// char A='a';
		// char B='b';

		// char res5=A+B;
		// System.out.println("Result = "+res5);//utilization

		// // res5='A'-'B';
		// // System.out.println("Result = "+res5);//utilization

		// res5=A*B;
		// System.out.println("Result = "+res5);//utilization

		// res5=A/B;
		// System.out.println("Result = "+res5);//utilization

		// res5=A%B;
		// System.out.println("Result = "+res5);//utilization

		int a=10;
		char b='A';

		System.out.println("Result = "+(a+b));
		System.out.println("Result = "+(a-b));
		System.out.println("Result = "+(a*b));
		System.out.println("Result = "+(a/b));
		System.out.println("Result = "+(a%b));

		int x=10;
		int y=20;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		x+=y;//add and store it in x x=x+y
		System.out.println("x = "+x); //30

		x-=y;//substract and store it in x x=x-y now x=30 y=20
		System.out.println("x = "+x); //10

		x*=y;//multiplication and store it in x x=x*y now x=10 y=20
		System.out.println("x = "+x);//200

		x/=y;//division and store it in x now x=200 y=20 
		System.out.println("x = "+x);

		x%=y;//modulus and store it in x now x=10 y=20
		System.out.println("x = "+x);

	}
}