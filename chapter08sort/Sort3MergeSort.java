package chapter08sort;

import java.util.Arrays;

public class Sort3MergeSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 72, 31, 1, 19, 8, 16};
        System.out.println("a = " + Arrays.toString(a));
        a = mergeSort(a);
        System.out.println("a = " + Arrays.toString(a));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2)
            return arr;
        int[] arr1 = splitLeft(arr);
        int[] arr2 = splitRight(arr);
        int[] sorted1 = mergeSort(arr1);
        int[] sorted2 = mergeSort(arr2);
        return merge(sorted1, sorted2);
    }

    public static int[] splitLeft(int[] arr) {
        int[] output = new int[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++)
            output[i] = arr[i];
        return output;
    }

    public static int[] splitRight(int[] arr) {
        int[] output = new int[arr.length - arr.length / 2];
        for (int i = arr.length / 2; i < arr.length; i++)
            output[i - arr.length / 2] = arr[i];
        return output;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int index = 0, i1 = 0, i2 = 0;
        int length1 = arr1.length, length2 = arr2.length;
        int[] output = new int[length1 + length2];

        while (i1 < length1 && i2 < length2)
            if (arr1[i1] < arr2[i2])
                output[index++] = arr1[i1++];
            else
                output[index++] = arr2[i2++];

        for (int i = i1; i < length1; i++)
            output[index++] = arr1[i];
        for (int i = i2; i < length2; i++)
            output[index++] = arr2[i];

        return output;
    }
}
