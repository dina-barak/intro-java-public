package chapter04methods.examples;

public class MethodExample3Armstrong {
    public static void main(String[] args) {
        for(int number = 10; number <= 1000; ++number)
            if (checkArmstrong(number))
                System.out.print(number + " ");
    }
    public static boolean checkArmstrong(int number) {
        int originalNumber = number;
        // number of digits calculation
        int digits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }
        originalNumber = number;
        // result contains sum of nth power of its digits
        int result = 0;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        return result == number;
    }
}
//153 370 371 407