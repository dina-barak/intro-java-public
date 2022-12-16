package chapter06recursion;

public class Recursion7PrintAllCombinations {
    public static void main(String[] args) {
        printAllCombinations(5, 3);
    }

    // assume k>=0, n>=0
    public static void printAllCombinations(int n, int k) {
        printAllCombinations(n, k, "");
    }
    private static void printAllCombinations(int n, int k, String acc) {
        if (n>=k) {
            if (k == 0)
                System.out.println(acc);
            else {
                printAllCombinations(n-1, k, acc);
                printAllCombinations(n-1, k-1, " "+n+acc);
            }
        }
    }


}
