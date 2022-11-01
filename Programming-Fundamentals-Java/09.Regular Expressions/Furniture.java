package RegularExpressions_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        List<String> furniture = new ArrayList<>();
        double totalSpendMoney = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String furnit = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double sum = quantity * price;
                totalSpendMoney += sum;
                furniture.add(furnit);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furnitur : furniture) {
            System.out.println(furnitur);
        }
        System.out.printf("Total money spend: %.2f", totalSpendMoney);
    }
}
