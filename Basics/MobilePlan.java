
import java.util.*;

public class MobilePlan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes used: ");
        int minutesUsed = sc.nextInt();

        System.out.print("Enter the number of text messages sent: ");
        int messagesUsed = sc.nextInt();

        double totalCostA = 25.0;
        double totalCostB = 40.0;
        double totalCostC = 60.0;

        if (minutesUsed > 100) {
            totalCostA += (minutesUsed - 100) * 0.10;
        }
        if (messagesUsed > 100) {
            totalCostA += (messagesUsed - 100) * 0.05;
        }

        if (minutesUsed > 200) {
            totalCostB += (minutesUsed - 200) * 0.08;
        }
        if (messagesUsed > 200) {
            totalCostB += (messagesUsed - 200) * 0.03;
        }

        double minCost = Math.min(totalCostA, Math.min(totalCostB, totalCostC));
        String bestPlan = "";

        if (minCost == totalCostA) {
            bestPlan = "Plan A";
        } else if (minCost == totalCostB) {
            bestPlan = "Plan B";
        } else {
            bestPlan = "Plan C";
        }

        System.out.printf("\nTotal Cost for Plan A: $%.2f\n", totalCostA);
        System.out.printf("Total Cost for Plan B: $%.2f\n", totalCostB);
        System.out.printf("Total Cost for Plan C: $%.2f\n", totalCostC);
        System.out.println("\nRecommended Plan: " + bestPlan);

        sc.close();
    }
}
