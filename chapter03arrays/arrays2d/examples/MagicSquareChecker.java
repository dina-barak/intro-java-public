package chapter03arrays.arrays2d.examples;

// JAVA program to check whether a given
// matrix is magic matrix or not
class MagicSquareChecker {
    public static void main(String[] args)
    {
        int mat[][] = {
                { 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }
        };

        // sumd1 and sumd2 are the sum of the two diagonals
        int sumd1 = 0,sumd2=0;
        for (int i = 0; i < mat.length; i++) {
            // (i, i) is the diagonal from top-left -> bottom-right
            // (i, N - i - 1) is the diagonal from top-right -> bottom-left
            sumd1 += mat[i][i];
            sumd2 += mat[i][mat.length-1-i];
        }
        // if the two diagonal sums are unequal then it is not a magic square
        if(sumd1!=sumd2)
            System.out.println("Not a magic square");

        // calculating sums of Rows and columns and checking if they are equal to each other,
        // as well as equal to diagonal sum or not
        for (int i = 0; i < mat.length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < mat.length; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                System.out.println("Not a magic square");
        }
        System.out.println("Magic square");
    }
}
