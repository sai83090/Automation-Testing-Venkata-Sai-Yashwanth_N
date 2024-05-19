package Assignment_47;

public class Daughter extends Parent 
{
	void Addition()
	{
		System.out.println("This is a Addition");
	}
	public static void main(String[] args) 
	{
		Daughter d1 = new Daughter();
		d1.Addition();
		d1.Multiply();

	}

}