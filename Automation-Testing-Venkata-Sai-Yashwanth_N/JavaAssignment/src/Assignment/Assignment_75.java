package Assignment;

public class Assignment_75 {
	public static void main(String[] args) {
		
		int arr[] = {23,35,40,41};
		int number = 41;
		
		for(int i=0;i<=3;i++)
		{
			if(number==arr[i])
			{
				System.out.println("Number have been check in the list : " + arr[i]);
			}
			else 
			{
				System.out.println("Number not present in the list :" + arr[i]);
			}
		}
	}
}
