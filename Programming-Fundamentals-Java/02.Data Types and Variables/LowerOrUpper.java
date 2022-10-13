package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals(input.toLowerCase())) {
            System.out.println("lower-case");
        } else if (input.equals(input.toUpperCase())) {
            System.out.println("upper-case");
        }
    }
}
