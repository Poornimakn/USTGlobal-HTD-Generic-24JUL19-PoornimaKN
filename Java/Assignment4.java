public class Assignment4{
	public static void main(String[] args) {
		float f=1.1234563f; //declared a var of type float and assigned it to a value which has 7 digits after decimal point.
		System.out.println(f); //displaying the var of float type, No Error. Gives 7 digits after decimal point
		float f1=1.123456789f;//declared a var of type float and assigned it to a value which has 9 digits after decimal point.
		System.out.println(f1);//displaying the var of float type, No Error Rounds off the digits after 7 decimal point.
	}
}