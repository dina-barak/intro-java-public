package chapter03arrays.quizes;

/**
 * Get prime numbers with boolean array
 */
public class QuizArrayOneDimPart2 {
    public static void main(String[] args) {
        boolean[] a = new boolean[1_000_000];//An array with one million elements
        for (int i = 0; i < a.length; i++)
            a[i] = true;
        //Arrays.fill(a, true);              //A method that sets all the elements of a to true.
        a[0] = a[1] = false;                 //The first two elements are set to false.

        for(int i = 2; i < a.length; i++)
            if(a[i] == true)
                for(int j = 2 * i; j < a.length; j += i)
                    a[j] = false;

        for(int i = 0; i < a.length; i++)  if(a[i]) System.out.println(i);


    }
}
