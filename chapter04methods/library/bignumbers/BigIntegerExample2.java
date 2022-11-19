package chapter04methods.library.bignumbers;

import java.math.BigInteger;
public class BigIntegerExample2
{
    public static void main(String args[]) throws Exception
    {
        BigInteger A  = BigInteger.valueOf(54);
        BigInteger B  = BigInteger.valueOf(54);
        BigInteger C  = BigInteger.valueOf(99);

        if (A.equals(B))
            System.out.println("A == B");
        else
            System.out.println("A != B");

        int result = A.compareTo(C);
        if (result < 0)
            System.out.println("A < C");
        else if (result > 0)
            System.out.println("A > C");
        else
            System.out.println("A == C");
    }
}
//A == B
//A < C