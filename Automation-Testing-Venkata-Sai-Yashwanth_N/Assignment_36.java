package Assignment;
import java.util.Scanner;
public class Assignment_36 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum of a and b:"+sum);
		
		int difference = a - b;
		System.out.println("Difference of a and b:"+ difference);

		int Multiply = a * b;
		System.out.println("Multiply of a and b:" + Multiply);
		
		int Division = a / b;
		System.out.println("Division of a and b:"+ Division);
	}

}
