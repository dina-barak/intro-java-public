package chapter02flowcontrol.loops.forloop;

// Program to print numbers from 1 to 5
class For2 {
    public static void main(String[] args) {
        int n = 5;

        // for loop
        for (int i = 0; i < n; i++) {
            System.out.println(i++);
        }
    }
}