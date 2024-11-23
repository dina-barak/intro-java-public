package chapter03arrays.arrays1d.more;

import java.util.Scanner;

/**
 * Returns the first occurrence of value in the array (-1 if it does
 * not occur).
 */
public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {3, 2, 9, 7, -3, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert value :");
        int value = scanner.nextInt();
        
        int position = 0;
        while (position < array.length - 1 && array[position] != value)
            position++;
        if (array[position] == value)
            System.out.println(position);
        else
            System.out.println(-1);
    }
}
