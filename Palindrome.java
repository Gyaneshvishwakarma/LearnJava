import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
