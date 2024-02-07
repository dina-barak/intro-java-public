package chapter02flowcontrol.guessinggame;

import java.util.Scanner;

/**
 * Guess a random integer - you have only one guess
 */
public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1 + (int)(Math.random() * 10);
        System.out.println("Please enter your guess:");
        int guess = scan.nextInt();
        if (guess == number)
            System.out.println("** Right **");
        else {
            System.out.println("...Sorry, you're wrong.");
            if (guess > number)
                System.out.println("Your guess is too high.");
            else System.out.println("Your guess is too low.");
        }
    }
}