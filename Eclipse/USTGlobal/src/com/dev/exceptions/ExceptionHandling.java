package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) throws CustomException{ //Exception,NegativeArraySizeException { //this will tells us that the method might throw an exception
//		try {
//			test();
//		}catch(Exception e) { //since we donno what type of exception it will throw
//			System.out.println("Exception Occured");
//			e.printStackTrace();  //displays what kind of exception occured.
//		}finally {		//without catch block finally block will not be executed.
//			System.out.println("This is finally block");
//		}
//		System.out.println("Code after exception");
		
		test();
//		System.out.println("Code after Exception");
		
		
		try {
			divide(10,0);
		}catch(Exception e)
		{
			throw new CustomException(1);
		}
		
	}
	
	public static int divide(int i, int j) {
		int res=i/j;
		System.out.println(res); 
		return 1;		
	}

	public static void test() throws CustomException // for this below code no need to give throws CustomException                                //Exception,NegativeArraySizeException
	{
//		StringBuffer sb= new StringBuffer(-1);
//		throw new CustomException();
		try {
			StringBuffer sb= new StringBuffer(-1);
		}catch(Exception e)
		{
			new CustomException().printStackTrace();
		}
	}
}
