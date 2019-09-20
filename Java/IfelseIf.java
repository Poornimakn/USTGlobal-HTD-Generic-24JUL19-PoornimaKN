public class IfelseIf{
	public static void main(String[] args) {
		int a=60,b=80,c=50;
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}