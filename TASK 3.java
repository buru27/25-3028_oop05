import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Online {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> orders = new ArrayList<>();

        int n;

        System.out.print("Enter number of orders: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter order amount: ");
            orders.add(sc.nextDouble());
        }

        orders.removeIf(order -> order < 500);

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                orders.set(i, orders.get(i) * 0.9);
            }
        }

        double totalRevenue = 0;
        for (double order : orders) {
            totalRevenue += order;
        }

        Collections.sort(orders);

        System.out.println("Sorted Orders: " + orders);
        System.out.println("Total Revenue after modifications: " + totalRevenue);

        sc.close();
    }
}
