
import java.util.Scanner;

public class PowerCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base a: ");
        int a = scanner.nextInt();

        System.out.print("Enter exponent b: ");
        int b = scanner.nextInt();

        scanner.close();

        double result = Math.pow(a, b);

        System.out.println(a + "^" + b + " = " +result);
    }
}
