package chapter04methods.examples;

/**
 * Motivation example for using methods
 * Part 2 (with methods)
 */
public class MotivationExamplePart2 {
    public static void main (String[] args)
    {
        int[][] mat = {
                { 2, 5, 7 },
                { 3, 7, 2 },
                { 5, 6, 9 }
        };
        int n = mat.length, m = 5;
        System.out.println( "Before:");
        printMatrix(mat,n); //print mat
        
        // This loop is for finding square of first diagonal elements
        for (int i1 = 0; i1 < n; i1++)
            for (int i2 = 0; i2 < n; i2++)
                if (i1 == i2)
                    mat[i1][i2]= mat[i1][i2] * mat[i1][i2];

        System.out.println( "\nAfter:");
        printMatrix(mat,n); //print mat
    }

    /**
     * Print matrix
     * @param mat  square matrix to be printed
     * @param n number of rows of matrix
     */
    public static void printMatrix(int[][] mat, int n){
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++)
                System.out.print(mat[i1][i2] + "\t");
            System.out.println();
        }
        //System.out.println(m);

    }
}
