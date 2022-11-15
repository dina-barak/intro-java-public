package chapter03arrays.arrays2d.examples;

// Java program to find maximum element of each row in a matrix
public class MaxInEachRow{
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5}
        };
        int i = 0;
        int max = 0;
        int[] result = new int[arr.length];
        while (i < arr.length) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max = 0;
            i++;
        }
    }
}

