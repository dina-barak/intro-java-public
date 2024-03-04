package chapter06recursion;

/**
 * Calculate exponent with recursion
 * and iteration
 */
public class Recursion0Exponent {
    public static void main(String[] args) {

        System.out.println(exponentRecursion((3)));
        System.out.println(exponentIterative((3)));
    }

    /**
     * Recursive calculation of 5^n
     * @param n non negative exponent
     * @return 5^n
     */
    public static int exponentRecursion(int n) {
        if (n==0) return 1;
        else  return 5 * exponentRecursion(n-1);
    }
    /**
     * Iterative calculation of 5^n
     * @param n non negative exponent
     * @return 5^n
     */
    public static int exponentIterative(int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 5;
        }
        return result;
    }

}
