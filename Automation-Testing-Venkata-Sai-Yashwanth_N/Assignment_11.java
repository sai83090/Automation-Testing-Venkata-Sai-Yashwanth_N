package Assignment;

public class Assignment_11 {
	
	static void Integer(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	
	static void Integer(double a, double b)
	{
		double sum = a + b;
		System.out.println(sum);
	}
	
	static void Integer(String name, String name_1)
	{
		String sum = name + name_1;
		System.out.println(sum);
	}
	
	void character(char a , char b)
	{
		System.out.println("DiyaShree");
	}

	void Boolean(boolean a)
	{
		System.out.println("Yashwanth");
	}
	public static void main(String[] args) {
		Integer(2,23);
		Integer(123.45,678.90);
		Integer("SaiYashwanth","DiyaShree");
		Assignment_11 a1 = new Assignment_11();
		a1.character('y','s');
		a1.Boolean(true);

	}

}
