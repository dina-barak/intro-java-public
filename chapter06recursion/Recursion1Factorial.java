package chapter06recursion;

public class Recursion1Factorial {
    public static void main(String[] args) {
        System.out.println(factorial((5)));
    }
    public static int factorial(int n) {
        int output;
        if (n==0)
            output = 1;
        else
            output = n*factorial(n-1);
        return output;
    }

}
