package chapter02flowcontrol.loops.forloop;

// Program to print a text 5 times
class For1 {
    public static void main(String[] args) {
        int n = 5;

        // for loop
        for (int i = 0, j = 0; i < n && j > -10; i++, j--) {
            System.out.println(" Java is fun");
        }
    }
}