package chapter02flowcontrol.loops.forloop;

// Program to find the sum of natural numbers from 1 to 1000.
class For3 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;

        // for loop
        for (int i = 1; i <= n; ++i) {
            sum += i; // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }
}