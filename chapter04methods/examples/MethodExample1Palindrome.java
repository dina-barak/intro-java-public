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
    /*public static boolean isPalindrome2(int number){
        if (number < 10) return true;
        if (number % 10 == 0) return false;
        int rightReverse = 0;
        while (number > rightReverse){
            int digit = number % 10;
            number /= 10;
            rightReverse = rightReverse * 10 + digit;
        }
        // Check if the number is a palindrome
        // For odd-length numbers, discard the middle digit by reversedHalf/10
        return number == rightReverse || number == rightReverse / 10;
    }*/
}
//3553 is Palindrome.