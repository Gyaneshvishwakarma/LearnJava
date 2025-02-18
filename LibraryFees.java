
import java.util.Scanner;

public class LibraryFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fine;
        
        System.out.print("Enter the number of days due: ");
        int daysDue = sc.nextInt();

        System.out.println("Enter the book type (regular, fiction, reference)");
        String bookType = sc.next();

        if (bookType.equalsIgnoreCase("regular")) {
            fine = daysDue * 0.25;
        } else if (bookType.equalsIgnoreCase("fiction")) {
            fine = daysDue * 0.35;
        } else if (bookType.equalsIgnoreCase("reference")) {
            fine = 00;
        } else {
            System.out.println("Invalid book type.");
            return;
        }
        System.out.println("Total late fees :"+fine);
    }
}
