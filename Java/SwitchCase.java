public class SwitchCase{
	public static void main(String[] args) {
		String day="Wed";
		switch(day){
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			case "Wed":
				System.out.println("Wednesday");
				break;
			case "Thu":
				System.out.println("Thursday");
				break;
			case "Fri":
				System.out.println("Friday");
				break;
			case "Sat":
				System.out.println("Satuday");
				break;
			case "Sun":
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}