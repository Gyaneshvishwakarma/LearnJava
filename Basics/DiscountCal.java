
import java.util.Scanner;

public class DiscountCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items purchased: ");
        int numItems = scanner.nextInt();

        System.out.print("Enter the total price ($): ");
        double totalPrice = scanner.nextDouble();

        double discount = 0.0;

        if (totalPrice > 100 && numItems >= 5) {
            discount = 0.10 * totalPrice;
        } else if (totalPrice >= 50 && totalPrice <= 100) {
            discount = 0.05 * totalPrice;
        }

        double finalPrice = totalPrice - discount;

        System.out.printf("Total Price: $%.2f\n", totalPrice);
        System.out.printf("Discount Applied: $%.2f\n", discount);
        System.out.printf("Final Price after Discount: $%.2f\n", finalPrice);

        scanner.close();
    }
}
