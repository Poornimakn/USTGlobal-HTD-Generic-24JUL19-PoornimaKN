public class IfElse{
	public static void main(String[] args) {
		int i=10,j=20;
		int a=30,b=30;
		if(i>j)
			System.out.println("i is greater than j");
		else{
			System.out.println("i is less than j");
			System.out.println("Code inside else block");
		}
		int c=a+b;
		if(c>=50)
		{
			System.out.println(c);
			System.out.println("c is greater than a and b");
		}
		else
		{
			System.out.println(c);
			System.out.println("c is less than 50");
		}
		System.out.println("Code executed successfully");
	}
}