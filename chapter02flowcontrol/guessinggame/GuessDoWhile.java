package chapter02flowcontrol.guessinggame;

import java.util.Scanner;

/**
 * Guess a random integer  - you have 4 guesses
 * using do-while
 */
public class GuessDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1 + (int)(Math.random() * 10);
        int guess = 0;
        int guessNumber = 0;
        do {
            System.out.println("Please enter your guess:");
            guess = scan.nextInt();
            if (guess == number)
                System.out.println("** Right **");
            else {
                System.out.println("...Sorry, you're wrong.");
                if (guess > number)
                    System.out.println("Your guess is too high.");
                else System.out.println("Your guess is too low.");
            }
            guessNumber ++;
        } while (guess != number && guessNumber < 4);
        System.out.println("The random number = " + number);
    }
}
