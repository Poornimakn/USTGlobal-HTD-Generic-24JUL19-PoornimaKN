package com.dev.exceptions;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			s();
			System.out.println("No Exception for s()");
			int res = divide(10,0);
			System.out.println("No Exception for divide()");
			System.out.println(res);
		}catch(NegativeArraySizeException e) {
			System.err.println("Exception Caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("Exception Caught in catch block");
			System.out.println("getMessage(): "+e.getMessage());
		}finally { // we can also have try and catch block in finally block
			System.out.println("Finally Block");
		}
	}
	public static int divide(int i, int j) {
		int res=i/j;
		System.out.println(res); //we can also write system.err.println()
		return 1;		
	}
	public static void s() 
	{
			StringBuffer sb= new StringBuffer(-1);
	}
}
