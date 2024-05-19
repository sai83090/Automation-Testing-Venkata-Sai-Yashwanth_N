package Assignment;
public class Assignment_81 {
	public static void main(String[] args) {
		String str = "Rahul123";
		int name = 0;
		int digit = 0;
		for(char i=0;i<str.length();i++) {
			if(Character.isLetter(i)) {
				name++;
			}
			else if (Character.isDigit(i)) {
				digit++;	
			}
	}
		System.out.println("Number of Character: "+ name);
		System.out.println("Number of digit:" + digit);
	}
}