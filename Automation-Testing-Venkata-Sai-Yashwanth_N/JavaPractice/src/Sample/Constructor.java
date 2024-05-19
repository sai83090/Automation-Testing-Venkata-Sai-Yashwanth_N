package Sample;

public class Constructor {
	
	Constructor()
	{
		int a = 10;
		int b = 20;
		int sum = 10 + 20;
		System.out.println(sum);
		System.out.println("Constructor");
	}
	
	Constructor(int x) 
	{
		int a = 12;
		int b = 4;
		int multiply = a * b;
		System.out.println(multiply);
		System.out.println("x value "+x);
	}
	
	Constructor(int x,int y) 
	{
		int a = 12;
		int b = 4;
		int multiply = a * b;
		System.out.println(multiply);
		System.out.println("x value "+x);
	}
	
//	void Constructor1()
//	{
//		int a = 13;
//		int b = 7;
//		int multi = a * b;
//		System.out.println(multi);
//	}
	static void Ss1() 
	{
		int a = 14;
		int b = 8;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		Constructor a1 = new Constructor();
		Constructor a2 = new Constructor(3);
//		a1.Constructor();
//		a1.Constructor1();
//		new Constructor();
//		Ss1();
	}
}
