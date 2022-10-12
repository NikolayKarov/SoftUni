package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalSum(product, quantity);

    }

    public static void totalSum(String product, int quantity) {
        double price = 0;
        if (product.equals("coffee")) {
            price = 1.50 * quantity;
            System.out.printf("%.2f", price);
        } else if (product.equals("water")) {
            price = 1.00 * quantity;
            System.out.printf("%.2f", price);
        } else if (product.equals("coke")) {
            price = 1.40 * quantity;
            System.out.printf("%.2f", price);
        } else if (product.equals("snacks")) {
            price = 2.00 * quantity;
            System.out.printf("%.2f", price);
        }
    }
}
