package chapter08sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-4,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            int candidate = arr[0];
            int candIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > candidate){
                    candidate = arr[j];
                    candIndex = j;
                }
            }
            swap(arr,  i, candIndex);
        }
    }

    public static void sort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
