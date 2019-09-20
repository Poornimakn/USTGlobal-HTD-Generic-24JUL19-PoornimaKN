public class Patterns5
{
	public static void main(String[] args) {
		char n='A';
		int space=3;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int k=0;k<=(2*(i-1));k++)
			{
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
		space=2;
		int m=1;
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=space;b++)
			{
				System.out.print(" ");
			}
			space++;
			for(int c=1;c<=(2*(3-a)-1);c++)
			{
				System.out.print(m);
				m++;
			}
			System.out.println(" ");
		}
	}
}