package chapter02.loops2.continues;

import java.util.Scanner;
class Continue2 {
    public static void main(String[] args) {
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in); // create an object of Scanner
        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            number = input.nextDouble(); // takes input from the user
            if (number <= 0.0) { // if number is negative continue statement is executed
                continue;
            }
            sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
