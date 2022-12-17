package chapter07search;

import java.util.Arrays;

public class Search6_BinarySearch_UsingArrays {
    public static void main(String[] args) {
        // Declaring and initializing arrays
        // to search over them
        char charArr[] = {'g', 'p', 'q', 'c', 'i'};
        int intArr[] = {10, 20, 15, 22, 35};
        double doubleArr[] = {10.2, 15.1, 2.2, 3.5};

        // Using sort() method of Arrays class
        // and passing arrays to be sorted as in arguments
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);

        // keys to search
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;

        // Print commands where we are implementing
        System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, charKey));
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
        System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArr, doubleKey));
    }
}
