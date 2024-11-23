package chapter06recursion;

public class Recursion0Stars {
    public static void main(String[] args) {
        
        printStars(8);

        //int starNumber = countStars(5);
        //System.out.println("number of stars printed = " + starNumber);
    }
    public static void printStars(int n){
        //System.out.println("in printStars: n = " + n);
        if (n == 0) return;

        else {
            System.out.println(" * ".repeat(n));
            printStars(n-1);

        }
        //System.out.println("before ending: n = " + n);

    }
    public static int countStars(int n){
        //System.out.println("in countStars: n = " + n);
        if (n == 0) return 0;

        else {
            System.out.println(" * ".repeat(n));
            return n + countStars(n-1);

        }
        //System.out.println("before ending: n = " + n);

    }

}
