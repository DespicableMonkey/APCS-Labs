public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        System.out.println(deck);
    }
}


class Deck
{
    private final Card[] cards;
    private final int size;

    public Deck()
    {
        size = 52; cards = new Card[size];
        String[][] stringRepresentations = {{"Clubs", "Diamonds", "Hearts", "Spades"}, {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}};
        for(int i = 0; i < size; ++i)
            cards[i] = new Card(stringRepresentations[0][i / 13], stringRepresentations[1][i % 13], (i % 13 < 9) ? (i%13+2) : ((i % 13) != 12) ? 10 : 11);
        this.shuffle();
    }

    private void shuffle() {
        for(int i = 0, randIndex1 = (int)(Math.random() * 52), randIndex2 = (int)(Math.random() * 52); i < 1000; ++i, randIndex1 = (int)(Math.random() * 52), randIndex2 = (int)(Math.random() * 52)) {
            Card temp = cards[randIndex1];
            cards[randIndex1] = cards[randIndex2];
            cards[randIndex2] = temp;
        }
    }

    public String toString() {
        String total = "";
        for(Card card : cards)
            total += card + "\n";
        return total;
    }
}

class Card
{
    private String suit;
    private String rank;
    private int value;

    public Card(String s, String r, int v)
    {
        suit = s;
        rank = r;
        value = v;
    }

    public String getSuit()       { return suit; }
    public String getRank()       { return rank; }
    public int getValue()         { return value; }

    public void setSuit(String s) { suit = s; }
    public void setRank(String r) { rank = r; }
    public void setValue(int v)   { value = v; }

    public String toString()
    {
        return "[" + suit + ", " + rank + ", " + value + "]";
    }

    public boolean matches(Card otherCard)
    {
        return otherCard.getSuit().equals(this.suit)
                && otherCard.getRank().equals(this.rank)
                && otherCard.getValue() == this.value;
    }
}

