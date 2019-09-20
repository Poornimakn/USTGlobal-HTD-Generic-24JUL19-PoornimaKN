public class Assignment5{
	public static void main(String[] args) {
		double d=1.1234563235647895; //declared a var of type double and assigned it to a value which has 16 digits after decimal point.
		System.out.println(d); //displaying the var of float type, No Error. Gives 16 digits after decimal point
		double d1=1.1234567892359874512;//declared a var of type float and assigned it to a value which has 18 digits after decimal point.
		System.out.println(d1);//displaying the var of float type, No Error Rounds off the digits after 16 decimal point.
	}
}