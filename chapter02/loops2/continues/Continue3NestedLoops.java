package chapter02.loops2.continues;

class Continue3NestedLoops {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 3) { // outer loop
            System.out.println("Outer Loop: " + i);
            while(j <= 3) { // inner loop
                if(j == 2) {
                    j++;
                    continue;
                }
                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}