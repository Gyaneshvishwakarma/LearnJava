import java.util.Scanner;

public class TriangleTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second side (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third side (c): ");
        int c = scanner.nextInt();

            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        
    }
}
