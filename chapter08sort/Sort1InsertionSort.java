package chapter08sort;

import java.util.Arrays;

public class Sort1InsertionSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 72, 31, 1, 19, 8, 16};
        System.out.println("a = " + Arrays.toString(a));
        insertionSort(a);
        System.out.println("a = " + Arrays.toString(a));
    }
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i = i + 1)
            insert(a, i);
    }
    private static void insert(int[] a, int i) {
        int value = a[i];
        // shift the larger elements to the right
        while (i > 0 && a[i - 1] > value) {
            a[i] = a[i - 1];
            i = i - 1;
        }
        a[i] = value;
    }
}
