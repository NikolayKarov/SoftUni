package TextProcessing_Lab;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            StringBuilder sb = new StringBuilder(word);
            System.out.printf("%s = %s%n", word, sb.reverse());
            word = scanner.nextLine();
        }
    }
}
