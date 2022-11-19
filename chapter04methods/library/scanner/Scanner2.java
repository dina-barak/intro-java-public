package chapter04methods.library.scanner;

import java.util.Scanner;
class Scanner2 {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // reads word from the keyboard
        String value = input.next();

        // prints the word
        System.out.println("next: " + value);

        // reads and prints another word
        value = input.next();
        System.out.println("next2: " + value);

        input.close();
    }
}
//Enter your name: James Gosling
//next: James
//next2: Gosling