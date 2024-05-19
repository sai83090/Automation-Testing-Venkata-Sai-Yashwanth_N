package Sample;

public class Saturday 
{	
	static void Add()
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
	
	static void Add1()
	{
		int a = 50;
		int b = 30;
		int minus = a - b;
		System.out.println(minus);				
	}
	
	static void Add2(int a, int b)
	{
		int  sum = a * b;
		System.out.println("Sum value is:" +sum);
	}
	
	static void Division(int a, double b)
	{
		double division = a / b;
		System.out.println("Division value is:" + division);
	}
	
    static void a1(int a, double b, char c) {
        double count = a + b;
        System.out.println(count);
        System.out.println("This is a Cricket game");
    }
    
    static void a2(int a , int b)
    {
    	if (b > a)
    	{
    		System.out.println("B is a greater than A");
    	}
    	else
    	{
    		System.out.println("A is a lesser than B");
    	}
    }
    
    static void between(int a, int b, int c, int d, String name)
    {
    	if (a == 10)
    	{
    		System.out.println("B is Equal to");
    	}
    	else if (b == a)
    	{
    		System.out.println("B is Not Equal to");
    	}
    	else if (b != a) {
    		System.out.println("B is a Greater than A");
    	}
    	else if(a > b)
    	{
    		System.out.println("A is less than B");
    	}
    	else if (d >= a)
    	{
    		System.out.println("B is Greater than or Equals to D");
    	}
    	else if (a <= d)
    	{
    		System.out.println("B is Less than or Equals to D");
    	}
    	
    	else if (name == "yashwanth") 
    	{
    		System.out.println("Sai Yashwanth");
    	}
    	
    	else {
    		System.out.println("No Control Statement");
    	}
    }
    
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		Add();
		Add1();
		Add2(12,3);
		Division(19,12.45);
		a1(78, 90.0, 'B');
		a2(10, 30);
		between(20,40,60,60,"yashwanth");
	}
}
	



