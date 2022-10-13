package BasicSyntaxConditionalStatementsAndLoops_Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sumHeadset = (lostGames / 2) * headsetPrice;
        double sumMouse = (lostGames / 3) * mousePrice;
        double sumKeyboard = (lostGames / 6) * keyboardPrice;
        double sumDisplay = (lostGames / 12) * displayPrice;

        double totalExpenses = sumHeadset + sumMouse + sumKeyboard + sumDisplay;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
