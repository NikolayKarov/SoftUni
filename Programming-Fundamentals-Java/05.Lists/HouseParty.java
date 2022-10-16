package Lists_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> namesOfGuest = new ArrayList<>();

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();

            List<String> commandParts = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
            String name = commandParts.get(0);

            if (commandParts.size() == 3) {
                if (namesOfGuest.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesOfGuest.add(name);
                }
            } else if (commandParts.size() == 4) {
                if (namesOfGuest.contains(name)) {
                    namesOfGuest.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : namesOfGuest) {
            System.out.println(name);

        }
    }
}
