package chapter04methods.examples;

import java.util.Arrays;

/**
 * Determine what multArray method does?
 */
public class QuizMethods {
    public static double[] multArray(double[] a, double k){
        a = new double[a.length];
        for(int i = 0; i < a.length; i++) a[i] *= k;
        return a;
    }

    public static void main(String[] args) {
        double[] b = new double[]{1,2,3};
        double[] c = multArray(b, 2);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

}
