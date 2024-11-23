package chapter07search;

//Time Complexity: O(log (log n))
//Auxiliary Space: O(1)

class Search7_InterpolationSearch_Iterative {
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = (arr.length - 1);

        while (arr[low] < arr[high] && arr[low] <= x && x <= arr[high]) {

            int pos = low + (high - low)
                            * (x - arr[low]) / (arr[high] - arr[low]);

            if (arr[pos] == x) return pos;
            if (arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }

        if (arr[low] == x)
                return low;
        else
                return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
        int x = 18; // Element to be searched

        int index = interpolationSearch(arr, x);

        if (index != -1) // If element was found
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}


