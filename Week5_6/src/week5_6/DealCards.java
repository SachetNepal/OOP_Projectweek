package week5_6;

public class DealCards {
    public static void main(String[] args) {
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            Card card = Card.dealRandomCard();
            System.out.println(card);
        }
    }
}
