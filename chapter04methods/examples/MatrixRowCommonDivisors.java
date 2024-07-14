package chapter04methods.examples;

/**
 * Prints for each row in a matrix the common divisors
 * where the matrix holds positive integers
 * For example, for int[][] mat = {
 *                                {4, 5, 3},
 *                                {6, 4, 2}};
 * common divisors of row 0
 * 1
 * common divisors of row 1
 * 1
 * 2
 *
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
     * Prints for each row in matrix mat
     * the common divisors for each row
     * @param mat matrix of positive integers
     */
    public static void matrixRowCommonDivisors(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println("common divisors of row " + i);
            rowCommonDivisors(mat[i]);
        }
    }

    /**
     * Prints common divisors for all elements in array row
     * @param row an array of positive integers
     */
    public static void rowCommonDivisors(int[] row){
        System.out.println(1);
        ArrayMin.arrayMin(row);//puts minimum of array in first cell of array
        int min = row[0];
        for (int i = 2; i <= min; i++) {
            //(row[0] % i == 0) && (row[1] % i == 0) && (row[2] % i == 0)
            boolean isDivisor = true;
            for (int j = 0; j < row.length; j++) {
                //isDivisor = isDivisor && (row[j] % i == 0);
                if (row[j] % i != 0) isDivisor = false;
                break;
            }
            if (isDivisor) System.out.println(i);
        }
    }
}
