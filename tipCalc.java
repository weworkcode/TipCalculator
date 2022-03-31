import java.util.Scanner;

public class CalculateTip {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create new Scanner object.

		// Prompt the user to enter the subtotal and the gratuity rate
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
                System.out.println("Enter Tip rate: ");
		double tipRate = input.nextDouble();
                

		// Calculate gratuity and total
		double tip = subtotal * (tipRate / 100);
		double total = subtotal + tip;

		// Display results
		System.out.println("The tip is $" + tip +
			" and total is $" + total);
	}
}
