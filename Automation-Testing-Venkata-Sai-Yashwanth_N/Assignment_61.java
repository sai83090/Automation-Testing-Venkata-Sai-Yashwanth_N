package Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment_61 {

	public static void main(String[] args) {
		System.out.println("Start your program");
		try {
			int i = 1 / 0;
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the integer value : ");
			int a = s1.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Bad Code");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Code red");
		}
		System.out.println("Rest of the code");
	}
}
