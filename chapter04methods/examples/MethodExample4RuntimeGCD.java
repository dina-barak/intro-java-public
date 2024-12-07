package chapter04methods.examples;

/**
 * Examines two methods for finding the greatest common divisor:
 * Implement algorithms for finding the GCD as methods
 * and compare their runtimes.
 *
 */
public class MethodExample4RuntimeGCD
{
    public static void main (String[] args)
    {
        int m = 1 + (int) (100 * Math.random());
        int n = 1 + (int) (100 * Math.random());
        System.out.println (
                "The first number is " + m +
                "\nThe second number is " + n +
                "\nBy algorithm 1: gcd = " + naiveGCD(m,n) +
                "\nBy algorithm 2: gcd = " + euclideanGCD(m,n));
        
        // Compare runtimes of methods. Note that method 2 is
        // run with quite larger integers.
        final int NUMBER_OF_TRIALS = 100_000;
        System.out.println (
                "\nRuntimes for " + NUMBER_OF_TRIALS +
                " pairs of integers are:");

        // Test method 1
        long time = timeNaiveGCD(NUMBER_OF_TRIALS);
        System.out.println ("By algorithm 1: " + time);

        // Test method 2
        time = timeEuclideanGCD(NUMBER_OF_TRIALS);
        System.out.println ("By algorithm 2: " + time);
    }// method main


    /**
     * Naive method for finding the g.c.d. of two integers.
     * Tries all integers from 1 up to min(n,m), and takes largest divisor
     * @param m positive first integer
     * @param n positive second integer
     * @return GCD of m and n
     */
    public static int naiveGCD (int m, int n)
    {
        int divisor = 1;
        int min = Math.min(n, m);
        for (int i=1; i <= min; i++)
            if ((m % i == 0) && (n % i == 0))
                divisor = i;
        return divisor;
    } // method naiveGCD

    /**
     * Timing NUMBER_OF_TRIALS iterations of the naive CGD
     * Here the numbers n and m are small
     * @param NUMBER_OF_TRIALS number of iterations
     * @return time of runtime
     */
    private static long timeNaiveGCD(int NUMBER_OF_TRIALS){
        long time = System.currentTimeMillis();
        for (int i=1; i <= NUMBER_OF_TRIALS; i++)
        {
            int m = 1 + (int) (Short.MAX_VALUE * Math.random());
            int n = 1 + (int) (Short.MAX_VALUE * Math.random());
            naiveGCD(m,n);
        }
        return System.currentTimeMillis() - time;
    } // method timeNaiveGCD
    /**
     * Euclidean algorithm method for finding the g.c.d. of two integers.
     * @param m positive first integer
     * @param n positive second integer
     * @return GCD of m and n
     */
    public static int euclideanGCD (int m, int n)
    {
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    } //  method euclideanGCD
    /**
     * Timing NUMBER_OF_TRIALS iterations of the naive CGD
     * Here the numbers n and m are small
     * @param NUMBER_OF_TRIALS number of iterations
     * @return time of runtime
     */
    private static long timeEuclideanGCD(int NUMBER_OF_TRIALS){
        long time = System.currentTimeMillis();
        for (int i=1; i <= NUMBER_OF_TRIALS; i++)
        {
            int m = 1 + (int) (Integer.MAX_VALUE * Math.random());
            int n = 1 + (int) (Integer.MAX_VALUE * Math.random());
            euclideanGCD(m,n);
        }
        return System.currentTimeMillis() - time;
    }// method timeEuclideanGCD
}// class MethodExample4RuntimeGCD