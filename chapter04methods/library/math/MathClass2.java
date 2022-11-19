package chapter04methods.library.math;

public class MathClass2 {
    public static void main(String[] args) {
        int i = 7;
        int j = -9;

        // min() returns the smaller of the two arguments you pass it
        System.out.println("min(" + i + "," + j + ") is " + Math.min(i,j));

        // max() returns the larger of two numbers
        System.out.println("max(" + i + "," + j + ") is " + Math.max(i,j));

        // The Math library defines a couple of useful constants:
        System.out.println("Pi is " + Math.PI);
        System.out.println("e is " + Math.E);
    }
}
//min(7,-9) is -9
//max(7,-9) is 7
//Pi is 3.141592653589793
//e is 2.718281828459045