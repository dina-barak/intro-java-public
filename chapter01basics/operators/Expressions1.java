package chapter01basics.operators;

public class Expressions1 {
    public static void main(String[] args) {
        int x1 = 27 % 5 + 7 / 3;
        System.out.println("x1 = " + x1);
        int x2 = 27 % (5 + 7) / 3;
        System.out.println("x2 = " + x2);

/*
        double d1 = 1.5;
        double d2 = d1++;
        System.out.println("d1 = " + d1 + ", d2 = " + d2);
*/
/*
        int value1 = 10;
        int value2 = 10;
        boolean bool0 = false;
        if (((value2 > value1) || bool0) && (!bool0 || (value2>value1))){
            System.out.println("if statement was true.");
        }
*/


    }
}
