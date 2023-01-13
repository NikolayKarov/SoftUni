package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankOfCard = scanner.nextLine();
        String suitOfCard = scanner.nextLine();

        Card card = new Card(CardSuit.valueOf(suitOfCard), CardRanks.valueOf(rankOfCard));

        System.out.printf("Card name: %s of %s; Card power: %d", CardRanks.valueOf(rankOfCard),
                CardSuit.valueOf(suitOfCard), card.getCardPower());
    }
}
