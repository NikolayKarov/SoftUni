package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {

            String[] commands = input.split(" - ");
            String currentCommand = commands[0];

            switch (currentCommand) {
                case "Collect":
                    String addItem = commands[1];
                    if (!inventory.contains(addItem)) {
                        inventory.add(addItem);
                    }
                    break;
                case "Drop":
                    String removeItem = commands[1];
                    inventory.remove(removeItem);
                    break;
                case "Combine Items":
                    String[] items = commands[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    if (inventory.contains(oldItem)) {
                        int indexOldItem = inventory.indexOf(oldItem);
                        inventory.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = commands[1];
                    if (inventory.contains(renewItem)) {
                        inventory.remove(renewItem);
                        inventory.add(renewItem);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
