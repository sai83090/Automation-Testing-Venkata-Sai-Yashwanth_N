package Sample;

public class MethodOverloading 
{
    void add(int a)
    {
    	int sum = a + 6;
    	System.out.println(sum);
    	System.out.println("Hi");
    }
    void add(double aa)
    {
    	double sum = aa + 45;
    	System.out.println(sum);
    }
    void add(char a) 
    {
    	System.out.println(a);
    }
    static void Name(String name)
    {
    	System.out.println(name);
    }
    static void Name(boolean a)
    {
    	System.out.println("Hi, I am Sai Yashwanth");
    }
    public static void main(String[] args) 
	{
		System.out.println("Hello World");
		MethodOverloading m1 = new MethodOverloading();
		m1.add(13);
		m1.add(1.12);
		m1.add('s');
		Name(true);
		Name("Sai Yashwanth");
	}
}
