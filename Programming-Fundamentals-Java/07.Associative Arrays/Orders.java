package AssociativeArrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String[] input = command.split("\\s+");
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);

            productsPrice.put(product, price);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            Double finalPrice = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalPrice);

        }
    }
}
