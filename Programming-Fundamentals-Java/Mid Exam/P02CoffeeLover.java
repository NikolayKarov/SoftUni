import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeType = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfCommands; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Include":
                    String coffee = commands[1];
                    coffeeType.add(coffee);
                    break;
                case "Remove":
                    String firstCommand = commands[1];
                    int countOfCoffeesToRemove = Integer.parseInt(commands[2]);
                    if (countOfCoffeesToRemove > coffeeType.size() || countOfCoffeesToRemove < 0) {
                        continue;
                    }
                    if (firstCommand.equals("first")) {
                        for (int j = 0; j < countOfCoffeesToRemove; j++) {
                            coffeeType.remove(0);
                        }
                    } else if (firstCommand.equals("last")) {
                        for (int j = 0; j < countOfCoffeesToRemove; j++) {
                            int index = coffeeType.size() - 1;
                            coffeeType.remove(index);
                        }
                    }
                    break;
                case "Prefer":
                    int firstIndex = Integer.parseInt(commands[1]);
                    int secondIndex = Integer.parseInt(commands[2]);

                    if (firstIndex > coffeeType.size() || firstIndex < 0 || secondIndex > coffeeType.size() || secondIndex < 0) {
                        continue;
                    }
                    Collections.swap(coffeeType, firstIndex, secondIndex);
                    break;
                case "Reverse":
                    Collections.reverse(coffeeType);
                    break;
            }
        }
        System.out.println("Coffees: ");
        for (String coffee : coffeeType) {
            System.out.print(coffee + " ");

        }
    }
}
