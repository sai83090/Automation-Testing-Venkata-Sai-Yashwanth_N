package Assignment;
import java.util.Arrays;
public class Assignment_84 {
	public static void main(String[] args) {
		String a1 = "animal";
		String a2 = "malin";
		a1 = a1.toLowerCase();
		a2 = a2.toLowerCase();
		if(a1.length() == a2.length())
		{	
			char[] charArray1 = a1.toCharArray();
			char[] charArray2 = a2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result)
			{
				System.out.println("Anagram is a String");
			}
			else 
			{
				System.out.println("Anagram is not a String");
			}
		}
		else {
			System.out.println("Anagram is not a String");
		}
		}
		}
		

