package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		
		FuncInterface f = () -> {
			try {
				
				for(int j=0;j<=10;j++)
					System.out.println("j = "+j);
				
				int k=10/5;
				System.out.println(k);
				
				int i=10/0;
				System.out.println(i);
				
			
			}catch(Exception e)
			{
				System.err.println("Exception... i.e., divide by zero");
			}
		};
		
		FuncInterface2 f1=(int m)->{
			for(int n=0;n<=m;n++)
			{
				System.out.println(n);
			}
		};
		f.printVal();
		f1.printVal(5);
		
	}
}
