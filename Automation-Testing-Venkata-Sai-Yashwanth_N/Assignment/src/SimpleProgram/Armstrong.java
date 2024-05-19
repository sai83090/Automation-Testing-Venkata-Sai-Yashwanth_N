package SimpleProgram;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int r,sum=0;
		
		
		while(num>0)
		{
			r = num%10;
			num=num/10;
			sum = sum + r*r*r;
		}
		if(temp == sum)
			System.out.println("It's a ArmStrong Number");
		else
			System.out.println("Not a ArmStrong Number");
	}

}
