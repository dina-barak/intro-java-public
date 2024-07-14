package chapter02flowcontrol.loops.dowhileloop;

// Program to display numbers from 1 to 5
class DoWhile1 {
    public static void main(String[] args) {
        int i = 0, n = 5;

        // do...while loop from 1 to 5
        do {
            i++;
            System.out.println(i);
        } while(i < n);
    }
}
