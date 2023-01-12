package chapter09greediness;

import java.util.Arrays;

// Program to find the lexicographically maximal array using
// at most k consecutive swaps.
class LargestArrayWithAtMostKConsecutiveSwaps1Iterative {
    // Swaps the consecutive positions 'i' and 'i'+1 of 'a'.
    // Assumes i < a.length-1
    static void swapConsecutive(int[] a, int i) {
        int tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;
    }

    // Function which maximize the array using at most
    // 'numOfSwaps' consecutive swaps.
    static void maximize(int[] array, int numOfSwaps) {
        for (int i = 0; i < array.length - 1; i++) {
            // If no more swaps remained, break the loop
            if (numOfSwaps == 0)
                break;

            // Here, indexPosition is set where we want to
            // put the current largest integer
            int indexOfMaxInRange = i;
            for (int j = i + 1; j < array.length; ++j) {
                // If we exceed the Max swaps then break the loop
                if (numOfSwaps < j - i)
                    break;

                // Find the maximum value from i+1 to max k or n
                // which will replace arr[indexPosition]
                if (array[j] > array[indexOfMaxInRange])
                    indexOfMaxInRange = j;
            }

            // Swap the elements from Maximum indexPosition
            // we found till now to the ith index
            for (int j = indexOfMaxInRange; j > i; j--)
                swapConsecutive(array, j - 1);

            // Updates k after swapping indexPosition-i elements
            numOfSwaps -= indexOfMaxInRange - i;
        }
    }

    public static void main(String args[]) {
        int[] array = {8, 7, 6, 5, 9, 4, 3, 10, 20};
        int maximumNumberOfConsecutiveSwapsAllowed = 9;

        maximize(array, maximumNumberOfConsecutiveSwapsAllowed);
        System.out.println(Arrays.toString(array));
    }
}
