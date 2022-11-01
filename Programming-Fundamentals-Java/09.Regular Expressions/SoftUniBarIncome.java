package RegularExpressions_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]*)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[\\d]+\\.*[\\d]*)\\$";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = price * quantity;
                totalIncome += sum;

                System.out.printf("%s: %s - %.2f%n", customer, product, sum);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
