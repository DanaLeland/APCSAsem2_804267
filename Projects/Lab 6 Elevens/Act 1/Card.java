public class Card {
    private String suit;
    private String rank;
    private int pointValue;
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        suit = cardSuit;
        rank = cardRank;
        pointValue = cardPointValue;
        
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int pointValue() {
        return pointValue;
    }

    public boolean matches(Card otherCard) {
        
    }

    @Override
    public String toString() {
        
        // String rank = "A" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "10" + "J" + "Q" + "K";
        // String suit = "Hearts" + "Spades" + "Clubs" + "Diamonds";
        
    }
}
