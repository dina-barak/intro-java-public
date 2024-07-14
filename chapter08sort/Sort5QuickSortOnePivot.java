package chapter08sort;

import java.util.Arrays;

public class Sort5QuickSortOnePivot {
    public static void main(String[] args) {
        int[] a = {3,7,8,5,2,1,9,5,4};
        System.out.println("a = " + Arrays.toString(a));
        quickSort(a);
        System.out.println("a = " + Arrays.toString(a));
    }
    public static void swap3(int[] a, int pivot, int i){
        int temp = a[pivot];
        a[pivot] = a[i];
        a[i] = a[pivot - 1];
        a[pivot - 1] = temp;
    }
    public static int movePivot(int[] a, int i, int pivot){
        while(i < pivot) {
            if (a[i] >= a[pivot]) swap3(a, pivot--, i);
            else i++;
        }
        return pivot;
    }
    public static void quickSort(int[] a, int start, int end){
        if(end - start <= 1) return;
        int pivot = movePivot(a, start, end);
        quickSort(a, start, pivot - 1);
        quickSort(a, pivot + 1, end);
    }
    public static void quickSort(int[] a){
        quickSort(a,0, a.length - 1);
    }

}
