package Assignment;
import java.util.Scanner;
public class Assignment_42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the value of a");
	            int a = sc.nextInt();
	            
	    System.out.println("Enter the value of b");
	            int b = sc.nextInt();
	            
	    System.out.println("Enter the value of c");
	            int c = sc.nextInt();
	    
	    switch (4)
	    {
	        case 1:
	        {
	            System.out.println("Additon of b and c :" + (b + c));
	            break;
	        }   
	        case 2:
	        {
	             System.out.println("Additon of b and c :" + (b - c));
	             break;
	        }
	         case 3:
	         {
	             System.out.println("Additon of b and c :" + (b * c));
	             break;
	         }
	        case 4:
	        {
	            if (c != 0)
	            {
	                System.out.println("Division of b and c :" + (b / c));
	            }
	            else 
	            {
	                System.out.println("Division cannot be zero");
	            }
	        }
	        default :
	        {
	            System.out.println("No Calacultor");
	        }
	    }
	}

}
