
package Sample ;
import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter a number
        System.out.println("Enter a number:");

        // Reading user input for the number
        int number = scanner.nextInt();

        // Closing the Scanner object
        scanner.close();

        // Checking if the number is positive or negative
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
