package chapter03arrays.arrays2d.examples;

class DiagonalSquarer
{
    public static void main (String[] args)
    {
        int mat[][] = {
                { 2, 5, 7 },
                { 3, 7, 2 },
                { 5, 6, 9 }
        };
        int n = mat.length;

        // This loop is for finding square of first diagonal elements
        System.out.print( "Diagonal one : ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == j)
                    System.out.print ( mat[i][j] * mat[i][j] +" ");
        System.out.println();

        // This loop is for finding square of second
        // side of diagonal elements
        System.out.print("Diagonal two : ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i + j == n - 1)
                    System.out.print(mat[i][j] * mat[i][j] +" ");
    }
}