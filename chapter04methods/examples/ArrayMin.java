package chapter04methods.examples;

import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2};
        arrayMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Put the minimal element in arr[0]
     * Only one swap
     * @param arr array input
     */
    public static void arrayMin(int[] arr){
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        swap(arr, 0, minIndex);
    }
    /**
     * Put the minimal element in arr[0]
     * This method does the same as the method above,
     * differently, it swaps elements in the array
     * each time it finds a smaller item then arr[0]
     * @param arr array input
     */
    public static void arrayMinVer2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]){
                swap(arr, 0, i);
            }
        }
    }

    /**
     * Swaps elements index1 and index2 in arr
     * @param arr input array
     * @param index1 index 1 to swap value
     * @param index2 index 2 to swap value
     */
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
