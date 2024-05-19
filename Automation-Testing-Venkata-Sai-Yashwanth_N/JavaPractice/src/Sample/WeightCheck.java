// Importing Scanner class
package Sample;

import java.util.Scanner;

public class WeightCheck {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter weight
        System.out.println("Enter your weight in kg:");

        // Reading user input for weight
        double weight = scanner.nextDouble();

        // Closing the Scanner object
        scanner.close();

        // Using if-else statement to check weight
        if (weight > 50) {
            // Printing your name if weight is greater than 50 kg
            System.out.println("Your Name");
        } else {
            // Printing Sharukh Khan if weight is not greater than 50 kg
            System.out.println("Sharukh Khan");
        }
    }
}
