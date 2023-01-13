package CardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRanks cardRank;
    private int cardPower;

    public Card(CardSuit cardSuit, CardRanks cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int getCardPower() {
        return this.cardSuit.getSuitPower() + this.cardRank.getPowerRank();
    }
}
