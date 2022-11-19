package chapter04methods.library.bignumbers;

import java.math.BigDecimal;
public class BigDecimalExample {
    public static void main(String[] args) {
        double a=0.03;
        double b=0.04;
        double c=b-a;
        System.out.println(c); //0.010000000000000002

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c); //0.01
    }
}
