package Assignment;

public class Assignment_8 
{
	Assignment_8()
	{
		System.out.println("sum");
	}
	
	Assignment_8(int a, int b, int c)
	{
		int sum = a + b + c;
		System.out.println(sum);
	}
	
	Assignment_8(int a, int b, int c, int d)
	{
		int sum = a * b * c * d;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		new Assignment_8();
		new Assignment_8(12,45,89);
		new Assignment_8(12,3,45,56);
		System.out.println("It's a value of Method b");
		

	}

}
