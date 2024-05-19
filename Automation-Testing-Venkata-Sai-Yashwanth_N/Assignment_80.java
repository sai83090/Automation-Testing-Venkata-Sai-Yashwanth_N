package Assignment;
public class Assignment_80 {
	public static void main(String[] args) {
		String s1 = "GroTechMinds890890";
		char c[] = s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			boolean name = Character.isAlphabetic(c[i]);
			if(name==true)
			{
				System.out.println(c[i] + " is a digit "+ name);
			}
			System.out.println(c[i]+ " is not a digit " + name);
		}
	}

}
