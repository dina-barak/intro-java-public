package chapter03arrays.arrays1d.looping;

class ArrayForEach {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5};

        // loop through the array using for-each loop
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }
    }
}