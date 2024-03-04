package chapter06recursion.predictOutput;

public class PredictOutput3 {

    public static int exercise1(int n){
        if (n < 0)  return  -1;
        if (n < 10) return 1;
        return 1 + exercise1(n/10);
    }

    public static void main(String[] args) {

        int x4 = exercise1(1000);
        System.out.println(x4);
    }
}

