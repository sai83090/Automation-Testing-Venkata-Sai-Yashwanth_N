package Sample;
import java.util.Scanner;
public class Return {

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
		
		double subtract()
		{
		double a1 = a.nextDouble();
		double b1 = b.nextDouble();
		double sub= a1-b1;
		System.out.println("minus of two number: " + sub);
		return sub;
		}
		
		float add_1()
		{
		float a1 = a.nextFloat();
		float b1 = b.nextFloat();
		float result = a1 + b1;
		System.out.println("Float of two number: " + result);
			return result;
		}
		
		String name()
		{
		String a1 = a.next();
		String b1 = b.next();
			String matching = a1 + b1;
			System.out.println("Name of two Number: " + matching);
			return matching;
		}
		
		boolean Sport()
		{
		boolean a1 = a.nextBoolean();
		boolean b1 = b.nextBoolean();
		boolean result = (a1 == b1);
		System.out.println("comparsion of a1 and b1 : " + result);
			return result;
		}
		
		public static void main(String[] args) {
			System.out.println("Hello World");
			Return c1 = new Return();
			c1.add();
			c1.subtract();
			c1.add_1();
			c1.name();
            c1.Sport();
		}
	}
