package chapter04methods.library.math;

public class MathClass1 {
    public static void main(String[] args) {
        int i = 7;
        int j = -9;
        double x = 72.3;
        double y = 0.34;

        // The absolute value of a number is equal to the number
        // if the number is positive or zero and equal to the negative
        // of the number if the number is negative.
        System.out.println("|" + i + "| is " + Math.abs(i));
        System.out.println("|" + j + "| is " + Math.abs(j));

        // Truncating and Rounding functions
        // You can round off a floating point number to the nearest integer with round()
        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));

        // The "ceiling" of a number is the smallest integer greater
        // than or equal to the number. Every integer is its own ceiling.
        System.out.println("The ceiling of " + j + " is " + Math.ceil(j));
        System.out.println("The ceiling of " + x + " is " + Math.ceil(x));

        // The "floor" of a number is the largest integer less than or equal to the number.
        // Every integer is its own floor.
        System.out.println("The floor of " + j + " is " + Math.floor(j));
        System.out.println("The floor of " + x + " is " + Math.floor(x));
    }
}

//|7| is 7
//|-9| is 9
//72.3 is approximately 72
//0.34 is approximately 0
//The ceiling of -9 is -9.0
//The ceiling of 72.3 is 73.0
//The floor of -9 is -9.0
//The floor of 72.3 is 72.0
