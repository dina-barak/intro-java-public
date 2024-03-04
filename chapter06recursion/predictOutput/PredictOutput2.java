package chapter06recursion.predictOutput;

public class PredictOutput2 {
    public static void main(String[] args) {

        System.out.println(someMethod(3));
    }
    public static int someMethod(int i){
        if(i == 0) return 0;
        return someMethod(i - 1);
    }

}
