package chapter02.loops2.nestedloops;

class NestedLoops2 {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        int i = 1;

        // outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);

            // inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }
    }
}