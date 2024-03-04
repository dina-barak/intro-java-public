package chapter06recursion;

/**
 * Factorial n! recursively
 */
public class Recursion1Factorial {
    public static void main(String[] args) {
        System.out.println(factorial((5)));
    }

    /**
     * Recursive function calculating n!
     * @param n non negative integer
     * @return factorial n!
     */
    public static int factorial(int n) {
        int output = 0;
        System.out.println("after initiating n = " + n + ", output = " + output);
        if (n == 0)
            output = 1;
        else
            output = n * factorial(n-1);
        System.out.println("before ending n = " + n + ", output = " + output);
        return output;
    }

}
