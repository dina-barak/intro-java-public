package chapter04methods.examples;

import java.util.Arrays;

public class ArrayOfPowers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfPowers(10, 3)));

    }
    public static int[] arrayOfPowers(int n, int power){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = powerFunction(i, power);
        }
        return arr;
    }
    public static int powerFunction(int base, int power){
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
