package Assignment;
import java.util.Scanner;
public class Assignment_21 {
	
	static int a = 40;
	static int b = 70;
	static int c;
	
	static Scanner s1 = new Scanner(System.in);

	static void Addition()
	{
		a = s1.nextInt();
		b = s1.nextInt();
		c = a + b;
		System.out.println(c);
	}
	
	static void subtraction()
	{
		a = s1.nextInt();
		b = s1.nextInt();
		c = a - b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Addition();
		subtraction();
	}
}
