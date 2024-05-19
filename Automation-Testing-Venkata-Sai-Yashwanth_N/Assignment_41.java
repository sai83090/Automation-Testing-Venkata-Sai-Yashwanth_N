package Assignment;
import java.util.Scanner;
public class Assignment_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	switch (1)
	{
	case 1:
		System.out.println("Addition of a :");
		int a = sc.nextInt();
		System.out.println("Addition of b :");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
		break;
	case 2:
	    System.out.println("Subtraction of d :");
	    int d = sc.nextInt();
	    System.out.println("Subtraction of e");
	    int e = sc.nextInt();
	    int f = d - e;
	    System.out.println(f);
	    break;
	case 3:
		System.out.println("Multiply of g :");
		int g = sc.nextInt();
		System.out.println("Multiply of h :");
		int h = sc.nextInt();
		int i = g * h;
		System.out.println(i);
		break;
	case 4:
		System.out.println("Division of j :");
		int j = sc.nextInt();
		System.out.println("Division of k :");
		int k = sc.nextInt();
		int l = j / k;
		System.out.println(l);
	default :
	{
		System.out.println("NO Calculator");
		break;
	}
	}
	}

}
