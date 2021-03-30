import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
    }
}

class Card{
    private String suit;
    private String rank;
    private int value;
    public Card(String s, String r, int v) {
        suit = s;
        rank = r;
        value = v;
    }
    public String getSuit() { return suit; }
    public String getRank() { return rank; }
    public int getValue()   { return value; }
    public boolean matches(Card otherCard)    {
        return otherCard.getSuit().equals(this.suit) && otherCard.getRank().equals(this.rank) && otherCard.getValue() == this.value;
    }
    public String toString()   {
        return "[" + suit + ", " + rank + ", " + value + "]";
    }
}
class Deck {
    private ArrayList<Card> cards;

    public Deck()
    {
        int size = 52;
        cards = new ArrayList<Card>();
        String suit[] = {"Heart", "Diamonds", "Club", "Spades"};
        String rank[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for(int i  = 0; i < 52; ++i){
            shuffle(new Card(suit[i/13], rank[i%13], (i%13 <= 8 ? i%13+2 : i%13<=11 ? 10 : 11)));
        }

    }

    public String toString() {
        String deckOutput = "";
        for(Card c : cards)
            deckOutput += c + "\n";
        return deckOutput;
    }

//    private void shuffle() {
//        for(int i = 0; i < 1000; ++i) {
//            int  r1 = (int)(Math.random()* 52), r2 = (int)(Math.random()* 52);
//            Card tmp = cards.get(r1);
//            cards.set(r1, cards.get(r2));
//            cards.set(r2, tmp);
//        }
//    }

    private void shuffle(Card c) {
        //this is the only way I could think of inserting cards into an arraylist without using a static array or 2 dynamic arrays, and not replacing/duplicating cards
        // The cards still are randomly inserted, but the shuffle method needs to take the card as a paramater and is run every loop iteration
            cards.add((int)(Math.random() * cards.size()), c);
    }
}