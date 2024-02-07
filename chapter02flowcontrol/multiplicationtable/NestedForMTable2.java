package chapter02flowcontrol.multiplicationtable;

/**
 * Multiplication table until 100 nested for
 * with break.
 * Replace break with continue and see what you get
 * What would happen when changing == with <= (continue)
 */
public class NestedForMTable2 {
    public static void main(String[] args) {

        stop:
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                if (j == i) {
                    System.out.print("\t");
                    break;
                }
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }

    }
}
