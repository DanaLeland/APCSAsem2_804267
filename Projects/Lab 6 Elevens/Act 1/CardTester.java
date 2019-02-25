/**
 * This is a class that tests the Card class.
 */
public class CardTester {
    public static void main(String[] args) {
         Card one = new Card("Queen", "Spades", 10);
         Card two = new Card("Jack", "Diamonds", 10);
         Card three = new Card("Two", "Clubs", 2);
         
         System.out.println("Card One: " + one.toString());
         System.out.println("Card Two: " + two.toString());
         System.out.println("Card Three: " + three.toString());
    }
}
