package chapter03arrays.arrays1d.more;

public class ArraysEquality {
    public static void main(String[] args) {
        char[] x = {'A', 'B', 'C'};
        char[] y = x;
        char[] z = {'A', 'B', 'C'};
        System.out.println(x == y); // equal
        System.out.println(x == z); // not equal

    }
}
