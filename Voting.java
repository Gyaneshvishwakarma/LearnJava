import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();


        if (age >= 18 && isCitizen)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}
