package chapter03arrays.arrays2d.basics;

import java.util.Arrays;

public class MaxCharInMatrix {
    public static void main(String[] args) {
        char[][] arr = new char[5][3];
        for (char[] arrRow : arr) {
            for (int i = 0; i < arrRow.length; i++) {
                arrRow[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
            }
            System.out.println(Arrays.toString(arrRow));
        }
        char[] max = new char[arr.length];
        for (int i = 0; i < 5; i++) {
            max[i] = arr[i][0];
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max[i])
                    max[i] = arr[i][j];
            }
        }
        System.out.println(Arrays.toString(max));
    }
}
