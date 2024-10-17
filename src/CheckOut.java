import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00):", 0.5, 10.0);
            totalCost += itemPrice;

            if (SafeInput.getYNConfirm(in, "Do you have more items to add? [Y/N]")) {
                // Continue if the user has more items
                System.out.println();
            } else {
                break; // Exit the loop if the user doesn't have more items
            }
        } while (true);

        System.out.printf("\nTotal Cost of Items: $%.2f%n", totalCost);
    }
}
