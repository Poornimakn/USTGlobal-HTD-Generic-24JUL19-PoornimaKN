public class LogicalOperator{
	public static void main(String[] args) {
		boolean b= true;
		boolean c = false;
		boolean x= true;

		boolean d = b&&c;
		System.out.println("b&&c "+d);

		d = b&&x;
		System.out.println("b&&x "+d);

		d= b||c;
		System.out.println("b||c "+d);

		d=!(b||c);
		System.out.println("!(b||c) "+d);
	}
}