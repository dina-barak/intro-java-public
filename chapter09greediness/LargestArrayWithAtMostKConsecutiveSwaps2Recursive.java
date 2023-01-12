package chapter09greediness;

import java.util.Arrays;

// Program to find the lexicographically maximal array using
// at most k consecutive swaps.
class LargestArrayWithAtMostKConsecutiveSwaps2Recursive {
    // Swaps the consecutive positions 'i' and 'i'+1 of 'a'.
    // Assumes i < a.length-1
    static void swapConsecutive(int[] a, int i) {
        int tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;
    }

    public static int findIndexOfMaxInRangeRecursively(int[] array, int index, int numOfSwaps, int indexOfMax) {
        if (array[index] > array[indexOfMax])
            indexOfMax = index;
        if (index == array.length-1 || numOfSwaps == 0)
            return indexOfMax;
        return findIndexOfMaxInRangeRecursively(array, index+1, numOfSwaps-1, indexOfMax);

    }

    public static void swapRecursively(int[] array, int index, int indexOfMaxInRange) {
        if (index == indexOfMaxInRange)
            return;
        swapConsecutive(array, indexOfMaxInRange-1);
        swapRecursively(array, index, indexOfMaxInRange-1);
    }

    static void maximizeRecursively(int[] array, int index, int numOfSwaps) {
        if (index == array.length - 1 || numOfSwaps == 0)
            return;

        // Here, indexPosition is set where we want to
        // put the current largest integer
        int indexOfMaxInRange = findIndexOfMaxInRangeRecursively(array, index, numOfSwaps, index);

        // Swap the elements from Maximum indexPosition
        // we found till now to the ith index
        swapRecursively(array, index, indexOfMaxInRange);

        // Updates k after swapping indexPosition-i elements
        numOfSwaps -= indexOfMaxInRange - index;

        maximizeRecursively(array, index + 1, numOfSwaps);
    }

    public static void main(String args[]) {
        int[] array = {8, 7, 6, 5, 9, 4, 3, 10, 20};
        int maximumNumberOfConsecutiveSwapsAllowed = 9;
        int index = 0;

        maximizeRecursively(array, index, maximumNumberOfConsecutiveSwapsAllowed);
        System.out.println(Arrays.toString(array));
    }
}
