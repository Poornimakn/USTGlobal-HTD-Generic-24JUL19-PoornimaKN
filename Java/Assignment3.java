public class Assignment3{
	public static void main(String[] args) {
		int i=-2147483648; //declared a var of type int and assigned it to a value which is in the range.
		System.out.println(i); //displaying the var of int type, No Error.
		int i1=-2147483649;//declared a var of type int and assigned it to a value which is out of range.
		System.out.println(i1);//displaying the var of int type, Gives Error.
	}
}