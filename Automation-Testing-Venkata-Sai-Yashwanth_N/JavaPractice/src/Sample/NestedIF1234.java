package Sample;

public class NestedIF1234 {

	public static void main(String[] args) {
		int marks = 60;
		char grade = 'B';
		if(marks>65)
		{
			if(grade=='B')
			{
				System.out.println("You are eligible for admissions");
			}
			else
			{
				System.out.println("Try next year");
				if(marks=='B')
				{
					System.out.println("Please");
				}
				else
				{
					System.out.println("Do");
				}
			}
			
		}
		else
		{
			System.out.println("you");
		}
	}

}
