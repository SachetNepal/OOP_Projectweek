package week5_6;

import java.util.Random;

class Card {
    private String suit;
    private String value;

    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] values = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public static Card dealRandomCard() {
        Random rand = new Random();
        String suit = suits[rand.nextInt(suits.length)];
        String value = values[rand.nextInt(values.length)];
        return new Card(suit, value);
    }

    public String toString() {
        return value + " of " + suit;
    }
}

