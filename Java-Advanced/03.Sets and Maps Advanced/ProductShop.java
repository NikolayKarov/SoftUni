package SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> products = new TreeMap<>();

        while (!input.equals("Revision")) {
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            if (!products.containsKey(shop)) {
                products.put(shop, new LinkedHashMap<>());
                if (!products.get(shop).containsKey(product)) {
                    products.get(shop).put(product, price);
                }
            }
            products.get(shop).put(product, price);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : products.entrySet()) {
            String shop = entry.getKey();
            LinkedHashMap<String, Double> productPrice = entry.getValue();
            System.out.println(shop + "->");
            for (Map.Entry<String, Double> productsEntry : productPrice.entrySet()) {
                String product = productsEntry.getKey();
                double price = productsEntry.getValue();

                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            }
        }
    }
}
