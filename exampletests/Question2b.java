package exampletests;

import java.util.Arrays;

public class Question2b {
    public static void main(String[] args) {
        int[] a = {6,7,3,2,4,5,1};
        int[] a1 = {1,1,2,3,4,9,6};
        int[] a2 = {1,2,3,4,4,4};
        System.out.println(Arrays.toString(a) + " " + isPermutation(a));
        System.out.println(Arrays.toString(a1) + " " + isPermutation(a1));
        System.out.println(Arrays.toString(a2) + " " + isPermutation(a2));
    }
    public static boolean isPermutation(int[] arr){
        int[] helpArr = new int[arr.length + 1];
        int numbers = 0;
        for (int i = 0; i < arr.length; i++) {
            int newNumber = arr[i];
            if (newNumber < 1 || newNumber > arr.length) return false;
            if (helpArr[newNumber] > 0) return false;
            helpArr[newNumber] = 1;
            numbers ++;
        }
        return numbers == arr.length;
    }
}
