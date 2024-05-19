package Sample;

public class IfElseStatement {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		
		if(a == 30 && b == 50)
		{
			System.out.println("And Operator");
		}
		else 
		{
			System.out.println("Not And Operator");
		}
		
		if(a == 30 || b == 50)
		{
			System.out.println("And Operator");
		}
		else 
		{
			System.out.println("Not And Operator");
		}
		
		if(!(a == 30 || b == 50))
		{
			System.out.println("And Operator");
		}
		else 
		{
			System.out.println("Not And Operator");
		}
		

	}

}
