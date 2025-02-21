import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd; 

        
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    
    public static int findGCD(int a, int b) {
        while (b != 0) { 
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
