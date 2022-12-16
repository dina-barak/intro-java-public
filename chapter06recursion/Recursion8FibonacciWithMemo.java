package chapter06recursion;

public class Recursion8FibonacciWithMemo {

    public static void main(String[] args) {

        System.out.println(fib(7));
    }
    public static int fib(int n) {
        int[] table = new int[n+1];

        for (int i=0;i< table.length;i=i+1){
            table[i] = -1; //EMPTY
        }

        return fib(table, n);
    }
    public static int fib(int[] table, int n){
        if (n == 0 | n == 1)
            return 1;
        else if (table[n] == -1){
            table[n] = fib(table, n-1) +
                    fib(table, n-2);
        }

        return table[n];
    }




}
