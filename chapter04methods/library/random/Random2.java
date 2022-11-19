package chapter04methods.library.random;

import java.util.Random;
public class Random2 {
    public static void main(String args[])
    {
        // create random object
        Random ran = new Random();

        // Returns integer in [0, 10)
        int nxt = ran.nextInt(10);

        // Printing the random number
        System.out.println("Random number in [0, 10) is : " + nxt);
    }
}
//Random number in [0, 10) is : 3
