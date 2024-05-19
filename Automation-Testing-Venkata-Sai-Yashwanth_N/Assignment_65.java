package Assignment;
import java.util.Arrays;
public class Assignment_65 {
	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0] = 34;
		rollno[1] = 90;
		rollno[2] = 78;
		rollno[3] = 98;
		int sc [] = new int[4];
		for(int i=0;i<4;i++)
		{
			sc[i] = rollno[i];
		}
		System.out.println("Original Array list : " +Arrays.toString(sc));
		System.out.println("Copy Array list : " + Arrays.toString(sc));
	}
}
