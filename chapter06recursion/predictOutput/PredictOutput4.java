package chapter06recursion.predictOutput;

public class PredictOutput4 {

    static void fun1(int x) {
        if (x > 0) {
            fun1(--x);
            System.out.print(x + " ");
            fun1(--x);
        }
    }

    static void fun1Prints(int x, int functionCall, int funGen) {
        if (x > 0) {
            fun1Prints(--x, 1, funGen + 1);
            System.out.println("fun-call " + functionCall + ", fun-Gen " + funGen + ", x = " + x);
            fun1Prints(--x, 2, funGen + 1);
        }
    }

    public static void main(String[] args) {

        int a = 4;
        fun1(a);
        System.out.println("\n");

        fun1Prints(a,0,1);
        System.out.println();
        }
}
