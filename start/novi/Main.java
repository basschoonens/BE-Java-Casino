package novi;

import novi.blackjack.Deck;

import java.util.Scanner;

//import novi.blackjack.BlackjackGame;
//import novi.higherlower.HigherLowerGame;

public class Main {

    public static void main(String[] args) {
//        Scanner inputScanner = new Scanner(System.in);
//        HigherLowerGame game = new HigherLowerGame(inputScanner);
//      BlackjackGame game = new BlackjackGame(inputScanner);

//        game.playGame();

        Deck deck = new Deck();
        deck.tmpPrintDeck();
    }
}
