package chapter05strings;

/**
 * Example of usage os ternary operator
 * Three ways for doing the same with a ternary operator
 */
public class TernaryOperator1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        //First way - in assignment
        String str3 = (str1 == str2) ? "same address" : "different address";
        System.out.println(str3);

        //Second way - as a parameter
        System.out.println((str1 == str2) ? "same address" : "different address");

        //Third way - ternary operator as a returned value
        System.out.println(ternaryOperator(str1,str2));;
    }
    public static String ternaryOperator(String str1, String str2){
        return  (str1 == str2) ? "same address" : "different address";
    }
}
