package chapter01.io;

import java.util.Scanner;

class Input2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}

//output
//Enter float: 2.343
//Float entered = 2.343
//Enter double: -23.4
//Double entered = -23.4
//Enter text: Hey!
//Text entered = Hey!