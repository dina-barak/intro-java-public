package chapter06recursion;

public class Recursion9NumberOfCombinationsWithMemo {
    public static void main(String[] args) {
        System.out.println(choose(5, 3));
    }

    // assume k>=0, n>=0
    public static int choose (int n, int k)
    {
        int[][] table = new int[n+1][k+1];

        for (int i=0; i<n+1; i=i+1)
            for (int j=0; j<k+1; j=j+1)
                table[i][j] = -1;

        return choose(table, n, k);
    }

    // assume k>=0, n>=0
    public static int choose(int[][] table, int n, int k) {
        if (n<k)
            return 0;
        if (n == k | k == 0)
            return 1;

        if (table[n][k] == -1){
            table[n][k] = choose(table,n-1,k) +  choose(table,n-1,k-1);
        }

        return table[n][k];
    }


}
