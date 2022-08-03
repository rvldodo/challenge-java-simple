package guessingNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a guessing number game.\nYou must guess the number between 1 to 10.\nYou have 3 attempts to try.");
        System.out.println("==========================");

        int randNumber = 1 + (int)Math.floor(Math.random() * 10);

        int attempt = 3;
        int i;

        for (i = 0; i < attempt; i++) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();

            if(guess < randNumber && i != attempt) {
                System.out.println("Number is too low!");
            } else if (guess > randNumber && i != attempt) {
                System.out.println("Number is too high!");
            } else if (guess == randNumber) {
                System.out.println("Congratulation! You guessed right the number!");
                break;
            }
        }

        if(i == attempt) {
            System.out.println("Your attempt is finish.\nThe number is " + randNumber);
        }
    }
}