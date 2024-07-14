package chapter05strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String result = reverseString(s);
        System.out.println("reverse of \"Hello\" = " + result);
    }

    /**
     * returns a string with characters in reverse order.
     * @param input string to reverse (not null)
     * @return string with reverse characters
     */
    public static String reverseString(String input){
        String result = "";
        int n = input.length();
        for (int i = 0; i < n; i++) {
            result += input.charAt(n - 1 - i);
        }
        return result;
    }

    /**
     * returns a string with characters in reverse order.
     * Note, here the result string is concatenated in "front" and
     * not "after" the result
     * @param input string to reverse (not null)
     * @return string with reverse characters
     */
    public static String reverseStringVer2(String input){
        String result = "";
        int n = input.length();
        for (int i = 0; i < n; i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }
}
