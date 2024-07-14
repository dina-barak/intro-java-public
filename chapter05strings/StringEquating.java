package chapter05strings;

import java.util.Arrays;

/**
 * Examples of String declarations
 */
public class StringEquating {
    public static void main(String[] args) {
        //equate arrays
        int[] array1 = {1};
        int[] array2 = {1};
        System.out.println("array1 == array2 is " + (array1 == array2));
        System.out.println("Arrays.equals(array1,array2) is " + Arrays.equals(array1,array2) + "\n");

        //equate strings
        String string1 = "Hello";
        String string2 = "World";
        String string3 = new String("Hello");
        String string4 = "Hello";
        System.out.println("string1 == string2 is " + (string1 == string2));
        System.out.println("string1 == string3 is " + (string1 == string3));
        System.out.println("string1 == string4 is " + (string1 == string4));
        System.out.println("string1 == \"Hello\" is " + (string1 == "Hello"));
    }
}
