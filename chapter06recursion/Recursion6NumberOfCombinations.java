package chapter06recursion;

public class Recursion6NumberOfCombinations {
    public static void main(String[] args) {
        System.out.println(choose(5, 3));
    }

    // assume k>=0, n>=0
    public static int choose(int n, int k)
    {
        if (n < k)
            return 0;

        if (k == 0)
            return 1;

        return choose(n - 1, k)
                + choose(n - 1, k - 1);
    }

}
