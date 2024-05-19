package Assignment;
public class Assignment_106 {
	
	int Add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	
	double Division(int a, int b)
	{
		int avg = a / b;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		Assignment_106 a1 = new Assignment_106();
		System.out.println(a1.Add(78, 34));
		System.out.println(a1.Division(12, 3));
	}

}
