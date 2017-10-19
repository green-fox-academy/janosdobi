package twentyplusone;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Color color;
    private Rank cardRank;

    public Card() {
        this.suit = Suit.randomSuit();
        this.cardRank = Rank.randomRank();
        if (this.suit.equals(Suit.DIAMONDS) || this.suit.equals(Suit.HEARTS)) {
            this.color = Color.RED;
        } else {
            this.color = Color.BLACK;
        }
    }

    public Rank getCardRank() {
        return cardRank;
    }

    @Override
    public int compareTo(Card o) {
        if (this.cardRank.getRank() == o.cardRank.getRank()) {
            return 0;
        } else if (this.cardRank.getRank() < o.cardRank.getRank()) {
            return 1;
        } else {
            return - 1;
        }
    }
}