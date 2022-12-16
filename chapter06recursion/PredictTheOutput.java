package chapter06recursion;

class PredictTheOutput {

    static void fun1(int x) {
        if (x > 0) {
            fun1(--x);
            System.out.print(x + " ");
            fun1(--x);
        }
    }

    static int fun2(int a, int b) {
        //System.out.println("a = " + a + "\t b = " + b);
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return fun2(a + a, b / 2);

        return fun2(a + a, b / 2) + a;
    }

    static int fun3(int a, int b)
    {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return fun3(a*a, b/2);

        return fun3(a*a, b/2)*a;
    }

    public static void main(String[] args) {
        int a = 4;
        fun1(a);
        System.out.println();

        int x = fun2(4, 3);
        System.out.println(x);

        int y = fun3(4, 3);
        System.out.println(y);
    }
}
