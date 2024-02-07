package chapter03arrays.arrays1d.looping;

/**
 * For loop runs faster than for-each
 * Timing for vs for-each loops
 */
public class ForEachTiming {
    public static void main(String[] args) {
        int[] myArray = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            myArray[i] = i;
        }
        int sum = 0;
        long forLoopStartTime = System.currentTimeMillis();
        for (int i = 0; i < myArray.length; i++) {sum += myArray[i];}

        long forLoopTraversalCost =System.currentTimeMillis()-forLoopStartTime;
        System.out.println("for loop traversal cost for ArrayList= "+ forLoopTraversalCost);

        sum = 0;
        long forEachStartTime = System.currentTimeMillis();
        for (Integer integer : myArray) {sum += integer;}

        long forEachTraversalCost =System.currentTimeMillis()-forEachStartTime;
        System.out.println("foreach traversal cost for ArrayList= "+ forEachTraversalCost);
    }
}
