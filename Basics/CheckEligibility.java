import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();
        System.out.print("full-time employee? (true/false): ");
        boolean isFullTime = scanner.nextBoolean();
        scanner.close();

        if (hours > 40 && isFullTime)
            System.out.println("Eligible for overtime pay");
        else
            System.out.println("Not eligible for overtime pay");
    }
}
