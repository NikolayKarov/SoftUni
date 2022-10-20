import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double price = 0;
        double priceWithoutTaxes = 0;
        double taxes = 0;
        double totalSum = 0;

        while (!command.equals("special") && !command.equals("regular")) {
            price = Double.parseDouble(command);
            if (price < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            priceWithoutTaxes += price;

            command = scanner.nextLine();
        }

        taxes = priceWithoutTaxes * 0.2;
        totalSum = priceWithoutTaxes + taxes;

        double finalSumWithDiscount = 0;
        if (command.equals("special")) {
            finalSumWithDiscount = totalSum - (totalSum * 0.1);
        }
        if (command.equals("regular")) {
            finalSumWithDiscount = totalSum;
        }
        if (totalSum == 0) {
            System.out.println("Invalid order!");
            return;
        }

        printReceipt(priceWithoutTaxes, taxes, finalSumWithDiscount);
    }

    private static void printReceipt(double priceWithoutTax, double taxes, double finalSumWithDiscount) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", priceWithoutTax);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", finalSumWithDiscount);
    }
}
