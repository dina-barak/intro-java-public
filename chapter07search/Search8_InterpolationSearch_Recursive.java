package chapter07search;

//Time Complexity: O(log (log n))
//Auxiliary Space: O(log (log n)), optimized O(1)

class Search8_InterpolationSearch_Recursive {
    public static int interpolationSearch(
            int[] arr, int lo, int hi, int x) {
        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            // Probing the position with keeping
            // uniform distribution in mind.
            pos = lo
                    + (x - arr[lo])
                    * (hi - lo) / (arr[hi] - arr[lo]);
            
            // Condition of target found
            if (arr[pos] == x)
                return pos;

            // If x is larger, x is in right sub array
            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi, x);

            // If x is smaller, x is in left sub array
            if (arr[pos] > x)
                return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
        int x = 18; // Element to be searched

        int index = interpolationSearch(arr, 0, arr.length - 1, x);

        if (index != -1) // If element was found
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}


