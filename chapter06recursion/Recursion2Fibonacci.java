package chapter06recursion;

public class Recursion2Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(7));
    }

    public static int fib(int n){
        int output;

        if (n == 0 | n == 1)
            output = 1;
        else
            output = fib(n-1) + fib(n-2);

        return output;
    }



}
