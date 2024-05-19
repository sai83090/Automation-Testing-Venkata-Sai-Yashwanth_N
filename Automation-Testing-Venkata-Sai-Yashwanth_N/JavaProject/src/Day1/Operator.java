package Day1;

public class Operator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("---------------Arithmetic Operator-----------------");
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Decreases of a and b is: "+(b-a));
		System.out.println("Multiply of a and b is: "+(a*b));
		System.out.println("Division of a and b is: "+ (a/b));
		
		
		int c = 20;
		int d = 30;
		System.out.println("------------Relational Operator----------------------");
		System.out.println("Equal of a and b is: " +(c==d));
		System.out.println("Less Than of a and b is: " +(c<d));
		System.out.println("Greater than of a and b is: "+ (d>c));
		System.out.println("Less than or Equal to of a and b is: " +(c<=d));
		System.out.println("Greater than or Equal of a and b is: "+(d>=c));
		System.out.println("Not Equal of a and b is: "+(c!=d));
		
		boolean x = true;
		boolean y = false;
		System.out.println("---------------Logical Operator------------------------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		a =10;
		a++;
		b = 20;
		b--;
		System.out.println("------------Increment/Decrement Operator---------------");
		System.out.println(a);
		System.out.println(b);

	}

}
