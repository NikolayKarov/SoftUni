import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfCommands; i++) {
            String[] input = scanner.nextLine().split(", ");
            String command = input[0];

            if (command.equals("Add")) {
                if (cards.contains(input[1])) {
                    System.out.println("Card is already in the deck");
                } else {
                    cards.add(input[1]);
                    System.out.println("Card successfully added");
                }

            } else if (command.equals("Remove")) {
                if (!cards.contains(input[1])) {
                    System.out.println("Card not found");
                } else {
                    cards.remove(input[1]);
                    System.out.println("Card successfully removed");
                }
            } else if (command.equals("Remove At")) {
                int index = Integer.parseInt(input[1]);
                if (index > cards.size() - 1) {
                    System.out.println("Index out of range");
                } else {
                    cards.remove(index);
                    System.out.println("Card successfully removed");
                }
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input[1]);
                if (index > cards.size() - 1 || index < 0) {
                    System.out.println("Index out of range");
                } else if (cards.contains(input[2])) {
                    System.out.println("Card is already added");
                } else {
                    cards.add(index, input[2]);
                    System.out.println("Card successfully added");
                }
            }
        }

        String output = cards.stream().collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
