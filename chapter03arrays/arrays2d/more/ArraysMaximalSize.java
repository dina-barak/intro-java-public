package chapter03arrays.arrays2d.more;

/**
 * Maximal size arrays with my current intellij definitions
 * Some reasons why we cannot declare theoretical array size:
 * Java garbage collector needs space,
 * Default java maximum memory (heap) allocation is predetermined by intellij
 * (of course this can be changed)
 * In my case: 2048m
 */
public class ArraysMaximalSize {
    public static void main(String[] args) {
        //int[] theoreticalArraySize = new int[2_147_483_647];
        int[] ar1 = new int[2_120_000_000];
        System.out.println("after initialization of array ar1.");

        //int[][] ar2 = new int[2][1_060_000_000];
        System.out.println("after initialization of array ar2.");

        //int[][][] ar3 = new int[2][2][530_000_000];
        System.out.println("after initialization of array ar3.");

    }
}
