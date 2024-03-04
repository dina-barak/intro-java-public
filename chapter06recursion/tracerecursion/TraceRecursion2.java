package chapter06recursion.tracerecursion;

public class TraceRecursion2 {
    public static void main(String[] args) {
        System.out.println(f(4));
        //for (int i = 0; i < 7; i++)
        //    System.out.println("f(" + i + ") = " + f(i));
    }
    public static int f(int n){
        if (n <= 1) return 2;
        else{
            int p1 = f(n-1);
            int p2 = f(n-2);
            //System.out.println("n = " + n + " p1 = " + p1 + " p2 = " + p2);
            return p1 + p2;
        }
    }
}
