package chapter02flowcontrol.loops.whileloop;

// Java program to find the sum of positive numbers
import java.util.Scanner;
class While2 {
    public static void main(String[] args) {
        int sum = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();// number = 5

        // while loop continues until entered number is positive
        while (number >= 0) {// number = 3
            // add only positive numbers
            sum += number;   // sum =  8

            System.out.println("Enter a number");
            number = input.nextInt(); // number = -3
        }
        System.out.println("Sum = " + sum);
        input.close();

    }
}
