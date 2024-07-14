package chapter02flowcontrol.guessinggame;

import java.util.Scanner;

public class GuessVer2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //initial part draw number
        int number = 1 + (int)(Math.random() * 10);

        //get guess from user


        int i = 0;

        /*while (guess != number && i < 3){
            //check quality of guess
            if (guess >=1 && guess <= 10){// 1 <= guess <= 10
                if (guess < number){ // 1 <= guess < number
                    System.out.println("guess is smaller than number");
                } else if (guess > number) { // number < guess <= 10
                    System.out.println("guess is larger than number");
                } else { // guess == number
                    System.out.println("very good number = " + number);
                }

            } else {
                System.out.println("The number is not between 1 and 10");
            }

            //get guess from user
            System.out.println("Please enter a number between 1 to 10:");
            guess = scan.nextInt();
            System.out.println("the entered number = " + guess);
            i++;
        } */
        int guess;

        do{
            System.out.println("Please enter a number between 1 to 10:");
            guess = scan.nextInt();
            System.out.println("the entered number = " + guess);
            //check quality of guess
            if (guess >=1 && guess <= 10){// 1 <= guess <= 10
                if (guess < number){ // 1 <= guess < number
                    System.out.println("guess is smaller than number");
                } else if (guess > number) { // number < guess <= 10
                    System.out.println("guess is larger than number");
                } else { // guess == number
                    System.out.println("very good number = " + number);
                }

            } else {
                System.out.println("The number is not between 1 and 10");
            }

            i++;
        } while (guess != number && i < 3);

        if (guess == number)
            System.out.println("very good number = " + number);
        else System.out.println("you have used 3 guesses. No more tries.");

        System.out.println("the random number is " + number);

    }
}
