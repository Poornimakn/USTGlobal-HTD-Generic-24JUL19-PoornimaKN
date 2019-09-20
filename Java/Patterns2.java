public class Patterns2
{
	public static void main(String[] args) {
		// int row=4;
		for(int i=1;i<=4;i++)
		{
			int num=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num + " ");
				num=num+4-j;
			}
			System.out.println();
		}
	}
}