package chapter06recursion.tracerecursion;

public class TraceRecursion1 {
    public static void main(String[] args) {
        System.out.println(f(86952));
    }
    public static int f(int num){
        if (num < 0) return f(-num);
        if (num < 10) return num;
        else {
            int x = num % 10;
            int y = f(num / 10);
            if (x >= y) return x;
            else return y;
        }
    }
}
