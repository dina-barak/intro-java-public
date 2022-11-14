package chapter03arrays.arrays1d.more;

public class ArraysInMemory {
    public static void main(String[] args) {

        int[] a; // undefined
        a = new int[3]; // initialized with zeros

        int[] b = {1, 2, 3}; // initialized with numbers

        a[0] = 5; // write

        b = a; // assign

        System.out.println(b[0]); // same array

        a[1] = 7;
        System.out.println(b[1]); // changes reflected
    }
}
