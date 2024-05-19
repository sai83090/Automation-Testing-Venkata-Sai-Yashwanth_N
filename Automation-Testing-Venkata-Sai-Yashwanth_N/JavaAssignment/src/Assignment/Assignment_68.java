package Assignment;

import java.util.Scanner;

public class Assignment_68 {
	String str;
	void Message()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.nextLine();
	}
	void Received()
	{
		int i = 0;
		str = str.toUpperCase();
		for(i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Assignment_68 obj = new Assignment_68();
		obj.Message();
		obj.Received();
	}
}
