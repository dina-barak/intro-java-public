package chapter04methods.library.bignumbers;

import java.math.BigInteger;
public class BigIntegerExample3
{
    // Returns Factorial of n
    public static BigInteger factorial(int n)
    {
        // Initialize result
        BigInteger result = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply result with 2, 3, ..., n
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }

    public static void main(String args[]) throws Exception
    {
        int n = 37;
        System.out.println(factorial(n));
    }
}
//13763753091226345046315979581580902400000000
