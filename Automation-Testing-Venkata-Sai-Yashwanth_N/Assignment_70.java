package Assignment;

public class Assignment_70 {

	public static void main(String[] args) {
		String m1 = "My Name is Manish";
		String reverse = "";
		
		for(int i=m1.length()-1;i>=0;i--)
		{
			reverse += m1.charAt(i);
		}
		System.out.println(reverse);
	}

}
