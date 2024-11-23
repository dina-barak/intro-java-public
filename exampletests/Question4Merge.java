package exampletests;

public class Question4Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 22};
        int[] arr2 = {2, 3, 6, 12};
        int[] arr3 = {14, 16, 21};
        printMerge(arr1, arr2, arr3);

    }
    public static void printMerge(int[] arr1, int[] arr2, int[] arr3){
        int i1 = 0, i2 = 0, i3 = 0;
        int n1 = arr1.length, n2 = arr2.length, n3 = arr3.length;
        while (i1 < n1 && i2 < n2 && i3 < n3){
            if (arr1[i1] <= arr2[i2] && arr1[i1] <= arr3[i3]) {
                System.out.println(arr1[i1]);
                i1++;
            }
            else if (arr2[i2] <= arr1[i1] && arr2[i2] <= arr3[i3]) {
                System.out.println(arr2[i2]);
                i2++;
            }
            else {System.out.println(arr3[i3]); i3++;}
        }
        while (i1 < n1 && i2 < n2){
            if (arr1[i1] <= arr2[i2]) {
                System.out.println(arr1[i1]);
                i1++;
            }
            else {
                System.out.println(arr2[i2]);
                i2++;
            }
        }
        while (i3 < n3 && i2 < n2){
            if (arr3[i3] < arr2[i2])
                System.out.println(arr3[i3++]);
            else
                System.out.println(arr2[i2++]);
        }
        while (i3 < n3 && i1 < n1){
            if (arr3[i3] < arr1[i1])
                System.out.println(arr3[i3++]);
            else
                System.out.println(arr1[i1++]);
        }
        while (i1 < n1){
            System.out.println(arr1[i1++]);
        }
        while (i2 < n2){
            System.out.println(arr2[i2++]);
        }
        while (i3 < n3) {
            System.out.println(arr3[i3++]);
        }

    }
}
