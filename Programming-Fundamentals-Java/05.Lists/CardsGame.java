package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayerHand.size() != 0 && secondPlayerHand.size() != 0) {
            int firstPlayerCard = firstPlayerHand.get(0);
            int secondPlayerCard = secondPlayerHand.get(0);

            firstPlayerHand.remove(0);
            secondPlayerHand.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerHand.add(firstPlayerCard);
                firstPlayerHand.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerHand.add(secondPlayerCard);
                secondPlayerHand.add(firstPlayerCard);
            }
        }

        if (firstPlayerHand.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", cardSum(secondPlayerHand));
        } else if (secondPlayerHand.size() == 0) {
            System.out.printf("First player wins! Sum: %d", cardSum(firstPlayerHand));
        }

    }

    public static int cardSum(List<Integer> cardsHand) {
        int sum = 0;
        for (Integer integer : cardsHand) {
            sum += integer;
        }
        return sum;
    }
}
