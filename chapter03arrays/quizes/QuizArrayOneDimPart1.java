package chapter03arrays.quizes;

/**
 * Performs a line in the main for-loop of QuizArraysOneDim
 * Question: What does it perform to the array of 100 boolean true entries?
 */
public class QuizArrayOneDimPart1 {
    public static void main(String[] args) {
        boolean[] a = new boolean[100];
        for (int i = 0; i < a.length; i++)
            a[i] = true;

        for(int j = 3; j < a.length; j += 3)
            a[j] = false;

        for(int j = 0; j < a.length; j++)
            if(!a[j]) System.out.println(j);


    }
}
