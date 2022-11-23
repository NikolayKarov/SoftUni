package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {
            String[] operations = commands.split("\\|");
            String currentOperation = operations[0];

            if (currentOperation.equals("ChangeAll")) {
                String substring = operations[1];
                String replacement = operations[2];

                message = message.replace(substring, replacement);

            } else if (currentOperation.equals("Insert")) {
                int index = Integer.parseInt(operations[1]);
                String value = operations[2];
                String firstPart = message.substring(0, index);
                String secondPart = message.substring(index);

                message = firstPart.concat(value).concat(secondPart);


            } else if (currentOperation.equals("Move")) {
                int numberOfLetters = Integer.parseInt(operations[1]);
                String firstPart = message.substring(0, numberOfLetters);
                String secondPart = message.substring(numberOfLetters);

                message = secondPart.concat(firstPart);

            }
            commands = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", message);
    }
}
