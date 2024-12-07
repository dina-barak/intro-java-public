package chapter03arrays.arrays2d.basics;

import java.util.Arrays;

public class MaxDoubleMatrix {
    public static void main(String[] args) {
        float[][] arr = new float[5][3];
        for (float[] arrRow : arr) {
            for (int i = 0; i < arrRow.length; i++) {
                arrRow[i] = (float) Math.random() * 10;
            }
            System.out.println(Arrays.toString(arrRow));
        }

        for (int i = 0; i < 5; i++) {
            int maxInd = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > arr[i][maxInd])
                    maxInd = j;
            }
            float temp = arr[i][0];
            arr[i][0] = arr[i][maxInd];
            arr[i][maxInd] = temp;
        }
        System.out.println("========================");
        for (float[] a : arr)
            System.out.println(Arrays.toString(a));
    }
}
