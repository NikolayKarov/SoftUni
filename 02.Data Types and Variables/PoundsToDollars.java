package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int britishPounds = Integer.parseInt(scanner.nextLine());

        double courseOfUSDollars = 1.36;
        double usDollars = britishPounds * courseOfUSDollars;

        System.out.printf("%.3f", usDollars);
    }
}
