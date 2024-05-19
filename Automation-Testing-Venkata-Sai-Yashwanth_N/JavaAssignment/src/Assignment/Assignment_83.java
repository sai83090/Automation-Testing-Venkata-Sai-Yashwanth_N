package Assignment;
import java.util.Scanner;
public class Assignment_83 {

	public static void main(String[] args) {
		String original , output = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String of a name: ");
		original = sc.nextLine();
		int length = original.length();
		
		for(int i = length-1;i>=0;i--)
		output =  output+ original.charAt(i);
		if(original.equals(output))
			System.out.println("Palindromne is a running Succesfully");
		else 
			System.out.println("Palindromne is not running Successfully");
	}

}
