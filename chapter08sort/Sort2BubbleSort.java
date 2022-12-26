package chapter08sort;

import java.util.Arrays;

public class Sort2BubbleSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 72, 31, 1, 19, 8, 16};
        System.out.println("a = " + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("a = " + Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        for (int numOfBbl = 0; numOfBbl < a.length - 1; numOfBbl++)
            for (int bbl = 0; bbl < a.length - 1; bbl++)
                if (a[bbl] > a[bbl + 1])
                    swap(a, bbl, bbl + 1);
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void bubbleSort2(int[] a) {
        for (int numOfBbl = 0; numOfBbl < a.length - 1; numOfBbl++) {
            boolean isSorted = true;
            for (int bbl = 0; bbl < a.length - 1 - numOfBbl; bbl++) {
                if (a[bbl] > a[bbl + 1]) {
                    swap(a, bbl, bbl + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }

}
