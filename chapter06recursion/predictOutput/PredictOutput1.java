package chapter06recursion.predictOutput;

class PredictOutput1 {

    static int fun2(int a, int b) {
        //System.out.println("a = " + a + "\t b = " + b);
        if (b == 0) return 0;

        if (b % 2 == 0)
            return fun2(a + a, b / 2);

        return fun2(a + a, b / 2) + a;
    }

    static int fun3(int a, int b)
    {
        //System.out.println("a = " + a + "\t b = " + b);
        if (b == 0) return 1;

        if (b % 2 == 0)
            return fun3(a * a, b/2);

        return fun3(a * a, b/2) * a;
    }


    public static void main(String[] args) {

        int x2 = fun2(4, 3);
        System.out.println(x2);

        int x3 = fun3(4, 3);
        System.out.println(x3);
    }
}
