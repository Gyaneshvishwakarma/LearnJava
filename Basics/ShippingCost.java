
import java.util.*;

public class ShippingCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package : ");
        double weight = sc.nextDouble();
        double shippingCost;
        System.out.print("Enter the distance ti be shipped :");
        double distance = sc.nextDouble();

        if (weight <= 10 && distance <= 100) {
            shippingCost = 5.00;
        } else if ((weight > 10 && weight <= 20) || (distance > 100 && distance <= 500)) {
            shippingCost = 10.00;
        } else {
            shippingCost = 20.00;
        }
        System.out.println("The shipping cost is :" + shippingCost);
        sc.close();

    }
}
