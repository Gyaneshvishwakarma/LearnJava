
import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        sc.close();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println(number + " is divisible by both 5 and 7.");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 7.");
        }
    }
}
