package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countOfRepeat = Integer.parseInt(scanner.nextLine());
        repeatString(input, countOfRepeat);

    }

    public static String repeatString(String string, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(string);
        }
        System.out.println(result);
        return string;
    }
}
