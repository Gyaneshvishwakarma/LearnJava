import java.util.Scanner;

public class QuadrantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter y-coordinate: ");
        int y = scanner.nextInt();
        
        scanner.close();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 4.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the Y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the X-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is at the Origin.");
        }
    }
}
