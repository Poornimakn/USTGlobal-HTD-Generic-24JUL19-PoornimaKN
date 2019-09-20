public class If_Else{
	public static void main(String[] args) {
		int marks = -108;
		if(marks>=91 && marks<=100)
			System.out.println("A Grade");
		else if(marks>=81 && marks<=90)
			System.out.println("B Grade");
		else if(marks>=71 && marks<=80)
			System.out.println("C Grade");
		else if(marks>=61 && marks<=70)
			System.out.println("D Grade");
		else if(marks>=51 && marks<=60)
			System.out.println("E Grade");
		else if(marks>=41 && marks<=50)
			System.out.println("Retest");
		else if(marks<=40 && marks>=0)
			System.out.println("Fail");
		else
			System.out.println("Invalid marks");
	}
}