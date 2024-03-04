package chapter05strings;

/**
 * Example of ternary operator
 */
public class TernaryOperator {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = (str1 == str2) ? "same address" : "different address";
        System.out.println(str3);
        System.out.println("we could also do this test inside the print line: " +
                ((str1 == str2) ? "same address" : "different address"));
        System.out.println(ternaryOperator(str1,str2));;
    }
    public static String ternaryOperator(String str1, String str2){
        return  (str1 == str2) ? "same address" : "different address";
    }
}
