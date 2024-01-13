package novi.higherlower;

import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        int randomNumber = (int) (Math.random() * 100) + 1;
        int turnCount = 0;

        System.out.println("Welcome to the Higher / Lower game");

            while (gameIsRunning) {
            System.out.println("Make a guess");

            var input = inputScanner.nextLine();
            System.out.printf("You typed: %s\n", input);

            if (Integer.parseInt(input) == randomNumber) {
                System.out.println("You guessed correctly!");
                System.out.println("You needed " + turnCount + " turns to guess the number");
                gameIsRunning = false;
            } else if (Integer.parseInt(input) < randomNumber) {
                System.out.println("The number is higher");
            } else if (Integer.parseInt(input) > randomNumber) {
                System.out.println("The number is lower");
            }
            turnCount++;
        }
    }
}
