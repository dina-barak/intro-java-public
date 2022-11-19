package chapter04methods.library.scanner;

import java.util.Scanner;
class Scanner1 {
    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // read line from the keyboard
        String name = input.nextLine();

        // prints the line
        System.out.println("nextLine: " + name);

        // closes the scanner
        input.close();
    }
}
//Enter your name: James Gosling
//My name is James Gosling