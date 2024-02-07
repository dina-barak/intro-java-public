package chapter02flowcontrol.multiplicationtable;

/**
 * Multiplication table up to 100 with nested for loop
 */
public class NestedForMTable1 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++){
                //System.out.print(i * k + "\t");
                System.out.print(i*j + "\t");
            }
            System.out.println("last line in the outer for loop");
        }
    }
}
