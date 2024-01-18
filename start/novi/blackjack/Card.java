package novi.blackjack;

public class Card {
private CardSuit suit;
private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public String render() {
        // TODO: Render the card
        // Example: 7♠

        return String.format("| %s %s |", suit.getSymbol(), value.getName());
    }

    public int getValue() {
        return value.getValue();
    }

}
