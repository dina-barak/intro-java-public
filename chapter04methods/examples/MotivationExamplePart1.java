package chapter04methods.examples;

/**
 * Motivation example for using methods
 * Part 1 (without methods)
 */
public class MotivationExamplePart1 {
    public static void main (String[] args)
    {
        int[][] mat = {
                { 2, 5, 7 },
                { 3, 7, 2 },
                { 5, 6, 9 }
        };
        int n = mat.length;
        System.out.println( "Before:");
        //print mat
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++)
                System.out.print(mat[i1][i2] + "\t");
            System.out.println();
        }
        
        // This loop is for finding square of first diagonal elements
        for (int i1 = 0; i1 < n; i1++)
            for (int i2 = 0; i2 < n; i2++)
                if (i1 == i2)
                    mat[i1][i2]= mat[i1][i2] * mat[i1][i2];

        System.out.println( "\nAfter:");
        //print mat
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++)
                System.out.print(mat[i1][i2] + "\t");
            System.out.println();
        }
    }
}
