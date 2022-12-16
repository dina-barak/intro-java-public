package chapter06recursion;

public class Recursion3Matching {

    public static void main(String[] args) {
        System.out.println(pm(7));
    }

    // assume n>=2 is even
    public static int pm(int n) {
        if (n%2 != 0)
            return 0;

        int output;
        if (n==2)
            output = 1;
        else
            output = (n-1)*pm(n-2);
        return output;
    }

}
