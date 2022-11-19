package chapter04methods.library.bignumbers;

import java.math.BigInteger;
public class BigIntegerExample1
{
    public static void main(String args[]) throws Exception
    {
        // declaration
        int a, b;
        BigInteger A, B;

        // initialization
        a = 54;
        b = 23;
        A  = BigInteger.valueOf(54);
        B  = BigInteger.valueOf(37);
        A  = new BigInteger("54");
        B  = new BigInteger("1000000000000000000000000");

        // math operations
        int c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        BigInteger C = A.add(B);
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }
}
//a = 54
//b = 23
//c = 77
//A = 54
//B = 1000000000000000000000000
//C = 1000000000000000000000054