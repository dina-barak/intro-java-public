package chapter02flowcontrol.loops2.continues;

class Continue3NestedLoops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) { // outer loop
            int j = 1;
            System.out.println("Outer Loop: " + i);
            while(j <= 3) { // inner loop
                if(j == 2) {
                    j++;
                    continue;
                }
                System.out.println("\tInner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}