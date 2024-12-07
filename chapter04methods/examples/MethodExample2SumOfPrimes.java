package chapter04methods.examples;

public class MethodExample2SumOfPrimes {
    public static void main(String[] args) {
        int number = 34;
        for (int i = 2; i <= number/2; ++i)
            if (checkPrime(i)) // condition for i to be a prime number
                if (checkPrime(number - i)) // condition for n-i to be a prime number
                    System.out.printf("%d = %d + %d\n", number, i, number - i); // n = primeNumber1 + primeNumber2
    }
    // Function to check prime n
    public static boolean checkPrime(int n) {
        for (int i = 2; i * i <= n; ++i)
            if (n % i == 0)
                return false;
        return true;
    }
}
//34 = 3 + 31
//34 = 5 + 29
//34 = 11 + 23
//34 = 17 + 17