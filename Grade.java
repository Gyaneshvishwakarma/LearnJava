import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sub 1: ");
        double sub1 = sc.nextDouble();
        System.out.print("Enter your Sub 2: ");
        double sub2 = sc.nextDouble();
        System.out.print("Enter your Sub 3: ");
        double sub3 = sc.nextDouble();
        double average = (sub1 + sub2 + sub3) / 3;
        
        char Grade;
        if (average >= 90) {
            Grade = 'A';
        } else if (average >= 80) {
            Grade = 'B';
        } else if (average >= 70) {
            Grade = 'C';
        } else if (average >= 60) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }
        
        System.out.println("Your Grade is: " + Grade);
        System.out.println("Average Score is :"+average);
        sc.close();
    }
}
