package Sample;
import java.util.Scanner;
public class pp1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("INput the 1st number:");
		int num1 = in.nextInt();
		
		System.out.println("INput the 2st number:");
		int num2 = in.nextInt();
		
		System.out.println("INput the 3st number:");
		int num3 = in.nextInt();
		
		if(num1> num2)
			if(num1 > num3)
			{
				System.out.println("The greateest:"+num1);
			
				if(num2> num1)
					if(num2 > num3)
					{
						System.out.println("The greateest:"+num2);
						
						if(num3> num1)
							if(num3 > num2)
							{
								System.out.println("The greateest:"+num3);
							
							}
					}
			}
	}

}
