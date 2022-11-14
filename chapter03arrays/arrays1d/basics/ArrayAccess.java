package chapter03arrays.arrays1d.basics;

public class ArrayAccess {
    public static void main(String[] args) {
        // create an array
        int[] age = {12, 4, 5, 2, 5};
        age[0] = 20; // assign 20 to the first cell
        age[1] = 30; // assign 30 to the second cell

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
}
//output
//Accessing Elements of Array:
//First Element: 20
//Second Element: 30
//Third Element: 5
//Fourth Element: 2
//Fifth Element: 5
