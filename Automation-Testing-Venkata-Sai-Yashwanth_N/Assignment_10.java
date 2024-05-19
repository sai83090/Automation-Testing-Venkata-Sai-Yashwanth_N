package Assignment;

public class Assignment_10 {
	
	static void Add()
	{
		int a = 12000;
		int b = 3000;
		int sum = a + b;
		System.out.println(sum);
	}
	
	static void Subtraction()
	{
		int a = 12000;
		int b = 3000;
		int sum = a - b;
		System.out.println(sum);
	}
	
	void Multiply()
	{
		int a = 12000;
		int b = 4000;
		int sum = a * b;
		System.out.println(sum);
	}
	void Division()
	{
		int a = 13000;
		int b = 5000;
		int sum = a / b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Add();
		Subtraction();
		Assignment_10 a1 = new Assignment_10();
		a1.Multiply();
		a1.Division();
	}

}
