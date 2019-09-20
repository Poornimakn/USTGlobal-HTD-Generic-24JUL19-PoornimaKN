public class Patterns4{
	public static void main(String[] args) {
		char c='A',b='a';
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
				System.out.print(b);
				b++;
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}