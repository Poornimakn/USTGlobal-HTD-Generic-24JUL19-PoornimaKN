public class Assignment1{
	public static void main(String[] args) {
		byte b = 127; //declared a var of byte type and assigned it to a value which is in the range of bytes
		System.out.println(b); //displaying the var of byte type, No Error
		byte b1 = 128;//declared a var of byte type and assigned it to a value which is out of range.
		System.out.println(b1);//displaying the var of byte type, Gives Error
	}
}