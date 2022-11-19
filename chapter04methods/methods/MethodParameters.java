package chapter04methods.methods;

class MethodParameters {

    // method with no parameter
    public static void display1() {
        System.out.println("Method without parameter");
    }

    // method with single parameter
    public static void display2(int a) {
        System.out.println("Method with a single parameter: " + a);
    }

    public static void main(String[] args) {

        // calling method with no parameter
        display1();

        // calling method with the single parameter
        display2(24);
    }
}