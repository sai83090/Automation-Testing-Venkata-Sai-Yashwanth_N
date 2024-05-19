package SimpleProgram;

public class Leapyear {
	public static void main(String[] args) {
		
		int year=1700;
		
		if(year % 400 ==0)
			System.out.println("Leap Year");
		else if (year % 100 == 0)
			System.out.println("Not a Leap Year");
		else if (year % 4 == 0)
			System.out.println("Leap Year");
		
		}
	

}
