package chapter05strings;

/**
 * Examples of declarations and assignment to Strings
 * examples of the operator "+" with strings
 */
public class StringKnownOperations {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        String string3 = string1 + string2;
        String string4 = string1 + " " + string2;
        String string5 = string1 + 5;
        String string6 = string1 + 5 * 6;
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
        System.out.println("string5 = " + string5);
        System.out.println("string6 = " + string6);

    }
}
