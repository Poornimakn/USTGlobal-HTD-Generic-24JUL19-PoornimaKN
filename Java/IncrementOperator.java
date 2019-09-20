public class IncrementOperator{
	public static void main(String[] args) {
		int i=10;
		i++; //post
		System.out.println(i);

		i=10;
		++i;//pre
		System.out.println(i);

		i=10;
		int j=i++;
		System.out.println(j);

		i=10;
		j=++i;
		System.out.println(j);
	}
}