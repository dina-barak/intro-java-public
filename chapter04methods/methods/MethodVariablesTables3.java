package chapter04methods.methods;

import java.util.Arrays;

/**
 * Example of swapping elements in array
 */
public class MethodVariablesTables3 {
    public static void main(String[] args){
        int[] a = {0, 10, 20, 30, 40};
        System.out.println(Arrays.toString(a)); //[0, 10, 20, 30, 40]
        swap(a, 1, 3);
        System.out.println(Arrays.toString(a)); //[0, 30, 20, 10, 40]
    }

    /**
     * Swaps element in index i and j in array a
     * @param a array of integers. Will be changed in method.
     * @param i index in [0, a.length - 1]
     * @param j index in [0, a.length - 1]
     */
    public static void swap(int[] a, int i, int j) {
        System.out.println(Arrays.toString(a)); //[0, 10, 20, 30, 40]
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        System.out.println(Arrays.toString(a)); //[0, 30, 20, 10, 40]
    }
}

