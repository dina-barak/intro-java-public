package chapter02flowcontrol;

import java.util.Scanner;

class QuizPreSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of the day:");
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Sunday");
        }
        else if (number == 2) {
            System.out.println("Monday");
        }
        else if (number == 3) {
            System.out.println("Tuesday");
        }
        else if (number == 4) {
            System.out.println("Wednesday");
        }
        else if (number == 5) {
            System.out.println("Thursday");
        }
        else if (number == 6 || number == 7) {
            System.out.println("Weekeng");
        }
        else System.out.println("no such day");
    }
}