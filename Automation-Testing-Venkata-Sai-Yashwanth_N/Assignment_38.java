package Assignment;
import java.util.Scanner;
public class Assignment_38 {

	public static void main(String[] args) {
		double d = 0.5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base of a Triangle of b :");
		double b = sc.nextInt();

		System.out.println("Enter the height of a Triangle of h :");
		double h = sc.nextInt();
		
		double area = d * b * h;
		
		System.out.println(area);
	}
}
		
		
