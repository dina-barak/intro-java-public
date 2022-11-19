package chapter04methods.library.math;

public class MathClass3 {
    public static void main(String[] args) {
        // exp(a) returns e (2.71828...) raised to the power of a.
        System.out.println("exp(1.0) is " + Math.exp(1.0));
        System.out.println("exp(10.0) is " + Math.exp(10.0));
        System.out.println("exp(0.0) is " + Math.exp(0.0));

        // log(a) returns the natural logarithm (base e) of a.
        System.out.println("log(1.0) is " + Math.log(1.0));
        System.out.println("log(10.0) is " + Math.log(10.0));
        System.out.println("log(Math.E) is " + Math.log(Math.E));

        // pow(x, y) returns the x raised to the yth power.
        System.out.println("pow(2.0, 2.0) is " + Math.pow(2.0,2.0));
        System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
        System.out.println("pow(8, -1) is "	 + Math.pow(8,-1));

        // sqrt(x) returns the square root of x.
        System.out.println("The square root of " + 49 + " is " + Math.sqrt(49));
    }
}
//exp(1.0) is 2.718281828459045
//exp(10.0) is 22026.465794806718
//exp(0.0) is 1.0
//log(1.0) is 0.0
//log(10.0) is 2.302585092994046
//log(Math.E) is 1.0
//pow(2.0, 2.0) is 4.0
//pow(10.0, 3.5) is 3162.2776601683795
//pow(8, -1) is 0.125
//The square root of 49 is 7.0
