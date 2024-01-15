package novi.blackjack;

import java.util.Scanner;

public class BlackjackGame {

    private Scanner inputScanner;
    boolean GameIsRunning = true;

        public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        boolean gameIsRunning = true;
        System.out.println("Playing Blackjack!");
    }

}
