package com.dev.inheritance;

public class Override2 extends Override1{

	@Override
	public void count()
	{
		int c=1;
		System.out.println(c);
	}
//	@Override
//	public static void count1()
//	{									cannot be overridden since its static
//		int count=0;
//		System.out.println(count);
//	}
	
//	@Override
//	private void count2(){				cannot be overridden since its private
//		System.out.println("count2");
//	}
	
//	@Override
//	public static final void count3()
//	{									cannot be overrridden since its final
//		int count=0;
//		System.out.println(count);
//	}
	
	public static void main(String[] args) {
		Override2 ov2=new Override2();
		ov2.count();
	}

}
