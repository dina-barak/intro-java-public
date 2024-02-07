package chapter03arrays.arrays1d.more;

public class ArrayInMemoryPrintAddress {
    public static void main(String[] args) {
        int[] a; // undefined
        a = new int[3]; // initialized with zeros

        int[] b = {1, 2, 3}; // initialized with numbers

        //print arrays a and b together with addresses stored in a and b
/*
        System.out.print("\nprint a: ");
        for (int num : a) System.out.print(num + ", ");
        System.out.println("the values stored in a: " + a);

        System.out.print("print b: ");
        for (int num : b) System.out.print(num + ", ");
        System.out.println("the values stored in b: " + b);
*/

        a[0] = 5; // write

        b = a; // assign


/*
        System.out.println("\nb[0] = " + b[0]); // same array

        //print arrays a and b together with addresses stored in a and b
        System.out.print("\nprint a: ");
        for (int num : a) System.out.print(num + ", ");
        System.out.println("the values stored in a: " + a);

        System.out.print("print b: ");
        for (int num : b) System.out.print(num + ", ");
        System.out.println("the values stored in b: " + b);
*/
/*
        a[1] = 7;
        System.out.println("\nb[1] = " + b[1]); // changes reflected

        a = new int[]{1,1,1};

        //print arrays a and b together with addresses stored in a and b

        System.out.print("\nprint a: ");
        for (int num : a) System.out.print(num + ", ");
        System.out.println("the values stored in a: " + a);

        System.out.print("print b: ");
        for (int num : b) System.out.print(num + ", ");
        System.out.println("the values stored in b: " + b);
*/

    }
}
