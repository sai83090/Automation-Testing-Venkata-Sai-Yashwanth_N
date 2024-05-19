package Assignment;

public class Assignment_62 {
	
	void Between(int a)
	{
		if(a > 18)
		{
			System.out.println("www.google.com");
		}
		else 
		{
			throw new ArithmeticException("You are not eligible for this site");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This is My Worlds is Bigger");
		Assignment_62 obj = new Assignment_62();
		obj.Between(21);
	}

}
