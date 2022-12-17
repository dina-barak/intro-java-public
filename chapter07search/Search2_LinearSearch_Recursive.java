package chapter07search;

//Time Complexity: O(N)
//Auxiliary Space: O(N), for using recursive stack space.
class Search2_LinearSearch_Recursive {
    static int linearsearch(int arr[], int size, int key) {
        if (size == 0)
            return -1;
        else if (arr[size - 1] == key)
            return size - 1;
        else
            return linearsearch(arr, size - 1, key);
    }
    static int linearsearch(int[] arr, int key) {
        return linearsearch(arr, arr.length, key);
    }
    public static void main(String[] args) {
        int[] arr = {5, 15, 6, 9, 4};
        int key = 4;
        int index = linearsearch(arr, key);
        if (index != -1)
            System.out.println("The element " + key + " is found at index " + index + ".");
        else
            System.out.println("The element " + key + " is not found.");
    }
}

