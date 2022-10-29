package sce.cs.chapter02.forloop;

// Infinite for Loop

class For5 {
    public static void main(String[] args) {
        int sum = 0;

        // for loop with a bug
        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }
}