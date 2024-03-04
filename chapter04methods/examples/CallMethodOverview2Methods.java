package chapter04methods.examples;

import chapter04methods.methods.MethodOverview2;

/**
 * Example: calling methods in other packages
 */
public class CallMethodOverview2Methods {
    public static void main(String[] args) {
        System.out.println("in main of class CallMethodOverview1Methods\n" +
                "in package chapter04methods.examples\n");
        MethodOverview2.method1();
        chapter04methods.methods.MethodOverview2.method2(5);

    }
}
