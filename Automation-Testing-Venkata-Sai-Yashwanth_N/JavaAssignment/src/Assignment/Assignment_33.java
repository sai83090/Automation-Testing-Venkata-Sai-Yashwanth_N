package Assignment;

public class Assignment_33 {
	
	static final double pi=3.14;
	
	static void Method_1()
	{
		 double r = 7;
		 double area;
		 area = pi * r * r;
		 System.out.println("Area of a Circle_1 :" + area);
	}
	static void Method_2()
	{
		double r = 14;
		double area;
		area = pi * r * r;
		System.out.println("Area of a Circle_2 :" + area);
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		Method_1();
		Method_2();

	}

}
