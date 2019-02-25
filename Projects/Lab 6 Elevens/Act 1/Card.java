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
        boolean tru = false;
        if(otherCard.suit.equals(this.suit) && otherCard.rank.equals(this.rank) && otherCard.pointValue == this.pointValue){
            tru = true;
        }
        return tru;
    }

    @Override
    public String toString() {
        return "suit: " + this.suit + " " + "| rank: " + this.rank + " " + "| value: " + this.pointValue; 
    }
}
