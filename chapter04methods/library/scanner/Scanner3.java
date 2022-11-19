package chapter04methods.library.scanner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
class Scanner3 {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        // reads a big integer
        System.out.print("Enter a big integer: ");
        BigInteger value1 = input.nextBigInteger();
        System.out.println("nextBigInteger: " + value1);

        // reads a big decimal
        System.out.print("Enter a big decimal: ");
        BigDecimal value2 = input.nextBigDecimal();
        System.out.println("nextBigDecimal: " + value2);

        input.close();
    }
}
//Enter a big integer: 12345678987654321234567898765432123456789
//nextBigInteger: 12345678987654321234567898765432123456789
//Enter a big decimal: 2.71828182845904523536028747135266249
//nextBigDecimal: 2.71828182845904523536028747135266249