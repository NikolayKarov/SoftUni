package SetsAndMapsAdvanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        int numberOfUsernames = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfUsernames; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }
        usernames.forEach(System.out::println);
    }
}
