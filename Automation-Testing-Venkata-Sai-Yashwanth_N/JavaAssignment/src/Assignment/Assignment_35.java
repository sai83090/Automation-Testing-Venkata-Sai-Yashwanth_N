package Assignment;
import java.util.Scanner;
public class Assignment_35 {
public static void main(String[] args) {
Scanner c1 = new Scanner(System.in);
		
		String name = c1.nextLine();
		int i = c1.nextInt();
		byte b = c1.nextByte();
		short s = c1.nextShort();
		double d = c1.nextDouble();
		float f = c1.nextFloat();
		long l = c1.nextLong();
		boolean b1 = c1.nextBoolean();
		
		System.out.println("String Name is :" + name);
		System.out.println("Integer Number is :" + i);
		System.out.println("Byte Number is :" + b);
		System.out.println("Short Number is :" + s);
		System.out.println("Double Number is :" + d);
		System.out.println("Float Number is :" + f);
		System.out.println("Long Number is :" + l);
		System.out.println("Boolean Number is :" + b1);

	}

}
