package Assignment;
import java.util.Scanner;

class  Company {
	Scanner a = new Scanner(System.in);
	Scanner b = new Scanner(System.in);
	
	int add()
	{
		int a1 = a.nextInt();
		int b1 = b.nextInt();
		int sum = a1 + b1;
		System.out.println("Sum of two number: " + sum);
		return sum;
	}
	
//	double subtract()
//	{
//		double sub= a-b;
//		return sub;
//	}
//	
//	float add_1()
//	{
//		float result = c + b; 
//		return result;
//	}
//	
//	String name()
//	{
//		String matching = name_1 + name_2;
//		return matching;
//	}
//	boolean Sport(boolean PP )
//	{
//		return PP;
//	}
//	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Company c1 = new Company();
		c1.add();
		
		

	}
}
