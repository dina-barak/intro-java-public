package chapter03arrays.arrays1d.looping;

/**
 * Timing for-loop vs for-each-loop for arrays in milliseconds
 * A millisecond is one-thousandth of a second;
 * microsecond, one-millionth of a second;
 * nanosecond, one-billionth of a second;
 */
public class ForEachTiming {
    public static void main(String[] args) {
        int[] myArray = new int[50_000_000];
        for (int i = 0; i < 50_000_000; i++) {
            myArray[i] = i;
        }
        int sum = 0;

        long forEachStartTime = System.currentTimeMillis();
        for (Integer integer : myArray) {sum += integer;}

        long forEachRuntime =System.currentTimeMillis()-forEachStartTime;
        System.out.println("for-each loop runtime = "+ forEachRuntime);

        sum = 0;
        long forLoopStartTime = System.currentTimeMillis();
        for (int i = 0; i < myArray.length; i++) {sum += myArray[i];}

        long forLoopRuntime =System.currentTimeMillis()-forLoopStartTime;
        System.out.println("for loop runtime = "+ forLoopRuntime);
    }
}
