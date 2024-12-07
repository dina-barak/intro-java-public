package chapter04methods.examples;

import java.util.Arrays;

/**
 * Print the common divisors for each row in
 * a matrix of positive integers
 * For example, for int[][] mat = {{4, 5, 3},
 *                                 {6, 4, 2}};
 * The printout is:
 * common divisors of row 0
 * 1
 * common divisors of row 1
 * 1
 * 2
 */
public class MatrixRowCommonDivisors {
    public static void main(String[] args) {
        int[][] mat = {
                {4, 5, 3},
                {6, 4, 2}
        };
        matrixRowCommonDivisors(mat);
    }

    /**
     * Print the common divisors for each row in matrix mat
     * @param mat matrix of positive integers
     */
    public static void matrixRowCommonDivisors(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println("common divisors of row " + i);
            rowCommonDivisors(mat[i]);
        }
    }

    /**
     * Print common divisors of all elements in array row
     * @param row an array of positive integers
     */
    public static void rowCommonDivisors(int[] row){
        System.out.println(1);
        ArrayMin.arrayMin(row);//put array minimum in row[0]
        for (int i = 2; i <= row[0]; i++) {
            boolean isDivisor = true;
            for (int j = 0; j < row.length; j++) {
                //isDivisor = isDivisor && (row[j] % i == 0);
                if (row[j] % i != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) System.out.println(i);
        }
    }
}
