package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Done")) {

            if (commands.equals("TakeOdd")) {
                password = getElementsOnOddPosition(password);
                System.out.println(password);

            } else if (commands.contains("Cut")) {
                int index = Integer.parseInt(commands.split("\\s+")[1]);
                int length = Integer.parseInt(commands.split("\\s+")[2]);
                String substringToRemove = password.substring(index, index + length);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);

            } else if (commands.contains("Substitute")) {
                String substring = commands.split("\\s+")[1];
                String substitute = commands.split("\\s+")[2];
                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            commands = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static String getElementsOnOddPosition(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int position = 0; position <= password.length() - 1; position++) {
            if (position % 2 != 0) {
                char currentElement = password.charAt(position);
                newPassword.append(currentElement);
            }
        }
        return newPassword.toString();
    }
}
