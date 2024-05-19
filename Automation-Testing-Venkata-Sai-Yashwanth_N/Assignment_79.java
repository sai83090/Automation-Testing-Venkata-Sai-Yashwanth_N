package Assignment;
import java.util.Arrays;
public class Assignment_79 {
	public static void main(String[] args) {
	String s1 = "GroTechMinds890890";
	char c[] = s1.toCharArray();
	for(int i=0;i<s1.length();i++) {
		boolean name = Character.isAlphabetic(c[i]);
		System.out.println(name);
	}
	}
}
