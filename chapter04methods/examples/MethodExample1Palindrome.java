package chapter04methods.examples;

class MethodExample1Palindrome {
    public static void main(String[] args) {
        int n = 3553;
        if (isPalindrome(n))
            System.out.println(n + " is Palindrome.");
        else
            System.out.println(n + " is not Palindrome.");
    }
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int remainder;
        int originalNumber = number; // store the number to originalNumber

        // get the reverse of originalNumber store it in variable
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // return true if reversedNumber and originalNumber are equal
        return originalNumber == reversedNumber;
    }
}
//3553 is Palindrome.