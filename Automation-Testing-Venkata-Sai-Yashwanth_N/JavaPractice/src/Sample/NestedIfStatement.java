package Sample;

public class NestedIfStatement {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a == 10) {
			System.out.println("Statement_1");
			if (b == 20) {
				System.out.println("Statement_2");
				if (c == 30) {
					System.out.println("Statement_3");
				} else {
					System.out.println("No Statement");
				}
			} else {
				System.out.println("Wrong Statement");
			}
		} else {
			System.out.println("Try again Sometimes");
		}

	}

}
