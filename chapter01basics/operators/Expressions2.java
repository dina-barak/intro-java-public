package chapter01basics.operators;

public class Expressions2 {
    public static void main(String[] args) {
        int value1=5, value2=10;
        boolean bool0=true;
        boolean bool1 = value1 <= value2; // bool1 = true
        boolean bool2 = value1+5 >= value2; // bool2 = true
        boolean bool3 = value1 < value2 / 2; // bool3 = false
        boolean bool4 = value1 != value2; // bool4 = true
        boolean bool5 = ! (value1 == value2); // bool5 = true
        boolean bool6=(value1<value2) || bool0; // bool6 = true
        boolean bool7=(value1<value2) && !bool0; // bool7 = false
        boolean bool8=((value2>value1) || bool0)
                && (!bool0 || (value2>value1)); // bool8 = true
    }

}
