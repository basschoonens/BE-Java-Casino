package novi.blackjack;

import java.util.Scanner;

public class BlackjackGame {

    private Scanner inputScanner;
    private boolean GameIsRunning = true;

    private Player player;
    private Dealer dealer;
    private Deck deck;

        public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        boolean gameIsRunning = true;
        System.out.println("Playing Blackjack!");
    }

}
