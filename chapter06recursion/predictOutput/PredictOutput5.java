package chapter06recursion.predictOutput;

public class PredictOutput5 {

    public static void main(String[] args) {
        System.out.println(fromToMult(-5, 5));
    }
    public static int fromToMult(int i, int j){
        if( i > j) return 1;
        if (i == j) return i;
        return i * j * fromToMult(i + 1, j - 1);
    }

}
