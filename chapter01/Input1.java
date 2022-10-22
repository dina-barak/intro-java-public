package sce.cs.chapter01;

import java.util.Scanner;

class Input1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("You entered " + number);

        input.close(); // closing the scanner object
    }
}
//output
// Enter an integer: 23
//You entered 23