package SimpleProgram;

public class EvenandOddNumber {

	public static void main(String[] args) {
	
		int n=10;
		System.out.println("odd" + "      " + "even");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
				System.out.println(i+"     ");
		}

	}

}
