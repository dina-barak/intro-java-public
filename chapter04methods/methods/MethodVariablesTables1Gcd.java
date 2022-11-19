package chapter04methods.methods;

import java.util.Scanner;
public class MethodVariablesTables1Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int result = gcd(m, n);
        System.out.println("The gcd of " + m + " and " + n + " is " + result);
    }
    // assumes m>0, n>0
    public static int gcd(int m, int n) {
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}
