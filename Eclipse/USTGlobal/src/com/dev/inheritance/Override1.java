package com.dev.inheritance;

public class Override1 {

	public void count()
	{
		int count=0;
		System.out.println(count);
	}
	public static void count1()
	{
		int count=0;
		System.out.println(count);
	}
	public static final void count3()
	{
		int count=0;
		System.out.println(count);
	}
	private void count2(){
		System.out.println("count2");
	}
	public static void main(String[] args) {
		Override1 ov1=new Override1();
		ov1.count();
		
	}

}
