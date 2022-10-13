package BasicSyntaxConditionalStatementsAndLoops_Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        String commands = "";
        while (true) {
            commands = scanner.nextLine();
            if (commands.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(commands);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.println("Cannot accept " + coin);
            }
        }

        double price = 0;
        String products;
        boolean flag = false;

        while (true) {
            products = scanner.nextLine();
            switch (products.toLowerCase()) {
                case "nuts":
                    price = 2;
                    flag = true;
                    break;
                case "water":
                    price = 0.7;
                    flag = true;
                    break;
                case "crisps":
                    price = 1.5;
                    flag = true;
                    break;
                case "soda":
                    price = 0.8;
                    flag = true;
                    break;
                case "coke":
                    price = 1;
                    flag = true;
                    break;
            }
            if (products.equals("End")) {
                break;
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else if (flag) {
                System.out.println("Purchased " + products);
                sum -= price;
            } else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
