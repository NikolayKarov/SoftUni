package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataInput = scanner.nextLine();
        switch (dataInput) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                int resultNumber = getMax(firstNumber, secondNumber);
                System.out.println(resultNumber);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char resultChar = getMax(firstChar, secondChar);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;
        }

    }

    public static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }

    public static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }
}
