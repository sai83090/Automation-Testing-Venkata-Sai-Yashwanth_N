package Assignment;

public class Assignment_6 
{
    void Addition()
    {
        int a = 2000;
        int b = 4000;
        int sum = a + b;
        System.out.println(sum);
    }
    
    void Subtraction()
    {
        int a = 10000;
        int b = 4000;
        int minus = a - b;
        System.out.println(minus);
    }
    
    void Multiply() 
    {
        int a = 4000;
        int b = 7000;
        int multiply = a * b;
        System.out.println(multiply);
    }
    
    void Division()
    {
        int a = 3000;
        int b = 7000;
        int division = a / b;
        System.out.println(division);
    }
    

	public static void main(String[] args) {
	System.out.println("Hello World");
	       Assignment_6 a1 = new Assignment_6();
	       a1.Addition();
	       a1.Subtraction();
	       a1.Multiply();
	       a1.Division();
	}

}
