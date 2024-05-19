package Sample;

public class NonStaticMethod 
{
	void dd() 
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
	
	void dd1()
	{
		int a = 50;
		int b = 30;
		int minus = a - b;
		System.out.println(minus);
	}
	
	void dd2(int x, int y)
	{
		int sum = x * y;
		System.out.println(sum);
	}
	
	static void Multiply()
	{
		int a = 13;
		int b = 8;
		int multiply = a * b;
		System.out.println(multiply);
	}
	
	static void Division()
	{
		int a = 15;
		int b = 3;
		int division = a / b;
		System.out.println(division);
	}
	public static void main(String[] args) {
		
		NonStaticMethod a1 = new NonStaticMethod();
		a1.dd(); // Non Static Method
	    a1.dd1();
	    a1.dd2(12, 5);
	    Multiply();
        Division();
	}
}
