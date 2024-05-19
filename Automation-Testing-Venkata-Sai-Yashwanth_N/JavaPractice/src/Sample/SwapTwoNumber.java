package Sample;
public class SwapTwoNumber {
	public static void main(String[] args) {
		int a = 45;
		int b = 90;
		System.out.println("Before Swap Number");
		System.out.println("First Number:" + a);
		System.out.println("Second Number:" + b);
		int temp = a;
		 a = b;
		 b = temp;
		System.out.println("After Swap Number");
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
	}

}
