public class Card {

    // Data variables
    private String suit;
    private String rank;
    private int value;
    private String picName;

    // Default constructor
    public Card() {
        suit = "heart";
        rank = "ace";
        value = 10;
        picName = "ah.gif";
    }

    // Parameterized constructor
    public Card(String suit, String rank, int value, String picName) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.picName = picName;
    }

    // Setters and getters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    public String getPicName() {
        return picName;
    }

    public String toString() {
        return "suit: " + suit + ", rank: " + rank + ", value: " + value + ", picName: " + picName;
    }

    public boolean equals(Card other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Card card = (Card) other;
        return value == card.value && suit.equals(card.suit) && rank.equals(card.rank);
    }
    
}