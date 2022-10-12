package Methods_Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        calculate(a, operator, b);
    }

    public static double calculate(int firstNumber, String operator, int secondNumber) {
        double result = 0;

        switch (operator) {
            case "/":
                result = firstNumber * 1.0 / secondNumber;
                System.out.printf("%.0f", result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.printf("%.0f", result);
                break;
            case "+":
                result = firstNumber + secondNumber;
                System.out.printf("%.0f", result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.printf("%.0f", result);
                break;
        }
        return result;
    }
}
