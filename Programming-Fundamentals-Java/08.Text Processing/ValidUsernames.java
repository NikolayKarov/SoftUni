package TextProcessing_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(", "))
                .filter(ValidUsernames::isValid)
                .forEach(System.out::println);
    }

    public static boolean isValid(String username) {
        return username.length() >= 3 && username.length() <= 16 && username.matches("[a-zA-Z_\\-\\d]+");
    }
}
