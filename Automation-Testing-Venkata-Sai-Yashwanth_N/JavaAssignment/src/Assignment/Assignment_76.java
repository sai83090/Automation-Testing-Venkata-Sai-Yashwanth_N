package Assignment;
public class Assignment_76 {
	public static void main(String[] args) {
	int arr[] = new int[4];
	int temp = 41;
	arr[0] = 23;
	arr[1] = 56;
	arr[2] = 90;
	arr[3] = 41;
	for(int i=0;i<4;i++)
	{
		if(temp == arr[i])
		{
			
			System.out.println("Number can be inside in the list :" + arr[i]);
		}
		else
		{
			System.out.println("Number cannot be inside in the list : " + arr[i]);
		}	
	}
	}
}
