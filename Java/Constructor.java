public class Constructor{
	final int v=10;
	static boolean b;
	public static test(){
		System.out.println("test()");
	}
	public static void main(String[] args) {
		System.out.println(new Constructor().v);
		test();
	}
}