package chapter03arrays.quizes;

import java.util.Scanner;

/**
 * Example for labeled bread for while
 */
public class QuizWhileLabeledBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            switch (scanner.nextInt()) {
                case 0:
                    break loop;
                case 1:
                    System.out.println("Easy homeworks will leave me professionally unprepared.");
                    break;
                case 2:
                    System.out.println("The syllabus is constructed to prepare me for a career and future courses.");
                    break;
                case 3:
                    System.out.println("My homework will be reviewed by anti-cheating software.");
                    break;
                case 5:
                    System.out.println("Cheating instead of working is a sure way to an unfulfilling career.");
                    break;
                case 6:
                    System.out.println("I need to solve homeworks myself to learn to code.");
                    break;
                default:
                    System.out.println("I can learn way more from trying code out than any person can teach me.");
            }
        }
        scanner.close();

    }
}