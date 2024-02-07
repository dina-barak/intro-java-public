package chapter03arrays.quizes;

/**
 * Prior to QuizArrayOneDimPart2 fins the multiplications of 3
 * in the boolean array
 * (after this we can move to fins all prime numbers up to 10^6
 */
public class QuizArrayOneDimPart1 {
    public static void main(String[] args) {
        boolean[] a = new boolean[1_000];//An array with one thousand elements
        for (int i = 0; i < a.length; i++)
            a[i] = true;
        //Arrays.fill(a, true);              //A method that sets all the elements of a to true.

        int i = 3;
        for(int j = i; j < a.length; j += i)
            a[j] = false;

        for(int j = 0; j < a.length; j++)  if(a[j]) System.out.println(j);


    }
}
