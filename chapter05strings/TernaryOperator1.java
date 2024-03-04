package chapter05strings;

/**
 * Example of ternary operator
 */
public class TernaryOperator1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        //ternary operator for assignment
        String str3 = (str1 == str2) ? "same address" : "different address";
        System.out.println(str3);
        //ternary operator inside a function
        System.out.println("ternary operator in a print statement : " +
                ((str1 == str2) ? "same address" : "different address"));
        //ternary operator for simpler return statement
        System.out.println("ternary operator in \"return\" statement: "
                + ternaryOperator(str1,str2));
        int num = str1.length();
        int num2 = 0;
        num = (str1.equals(str2)) ? num * 2 : (num2 = num / 2);
        System.out.println("\nnum = " + num + "\nnum2 = " + num2);

    }

    /**
     * Compares addresses of two strings
     * uses ternary operator
     * @param str1 first String
     * @param str2
     * @return
     */
    public static String ternaryOperator(String str1, String str2){
        return  (str1 == str2) ? "same address" : "different address";
    }
}
