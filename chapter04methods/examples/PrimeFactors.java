package chapter04methods.examples;

public class PrimeFactors {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i+=7) {
            System.out.print("i = " + i + ": prime factors: ");
            primeFactors(i);
            System.out.println();
        }

    }
    public static void primeFactors(int num){
        int factor = 2;
        while (num > 1){
            if(num % factor == 0){
                System.out.print(factor + " ");
                num /= factor;
            } else factor++;
        }

    }
}
