package chapter04methods.library.arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println("a = " + Arrays.toString(a));
        Arrays.fill(a,1);
        System.out.println("after 'fill' a = " + Arrays.toString(a));
        int[] b = Arrays.copyOf(a,3);
        System.out.println("after copyOf b = " + Arrays.toString(b));
    }
}
