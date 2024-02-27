package novi.blackjack;

public class CardValue {

    private String name;
    private int value;

    public CardValue(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static CardValue[] values() {
        return values;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    static CardValue[] values = new CardValue[] {
            new CardValue("Two", 2),
            new CardValue("Three", 3),
            new CardValue("Four", 4),
            new CardValue("Five", 5),
            new CardValue("Six", 6),
            new CardValue("Seven", 7),
            new CardValue("Eight", 8),
            new CardValue("Nine", 9),
            new CardValue("Ten", 10),
            new CardValue("Jack", 10),
            new CardValue("Queen", 10),
            new CardValue("King", 10)
    };

}
