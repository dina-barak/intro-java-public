package chapter02.loops2.breaks;

class Break3NestedLoops {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        // outer loop
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);
            // inner loop
            for (int j = 1; j <= days; ++j) {
                if (i == 2) { // break inside the inner loop
                    break;
                }
                System.out.println("  Days: " + j);
            }
        }
    }
}