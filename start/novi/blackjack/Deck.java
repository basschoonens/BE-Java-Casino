package novi.blackjack;

import java.util.List;

public class Deck {

    private Card[] cards;
    private Card getNextCard;
    private boolean isEmpty;

    public Deck() {
        // TODO: Create the deck of cards

        cards = new Card[48];

        int index = 0;

        for (CardSuit suit : CardSuit.suits()) {
            for (CardValue value : CardValue.values()) {
                cards[index] = new Card(suit, value);
                index++;
            }
        }

    }

    public void tmpPrintDeck() {
        for (Card card : cards) {
            System.out.println(card.render());
        }
    }

    public void Shuffle() {
        // TODO: Shuffle the deck of cards
    }
//    public isEmpty() {
//        // TODO: Not clear what this method should do
//    }
//    public getNextCard() {
//        // TODO return the next card from the deck
//    }

}
