package Assignment;

public class Assignment_66 {

	public static void main(String[] args) {
	int sc[] = new int[4];
	sc[0] = 3;
	sc[1] = 4;
	sc[2] = 5;
	sc[3] = 6;
	
	int sum = 0;
	for(int i=0;i<sc.length;i++)
	{
		sum = sum + sc[i];
	}
	
	System.out.println(sum);
	double average = sum/sc.length;
	System.out.println(average);
	
	}
}
