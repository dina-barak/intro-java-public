package chapter04methods.library.random;

import java.util.Random;
public class Random1 {
    public static void main(String[] args)
    {
        // create random object
        Random ran = new Random();

        // generating integer
        int n = ran.nextInt();

        // Printing the random Number
        System.out.println("The Randomly generated integer is : " + n);
    }
}
//The Randomly generated integer is : -737111926
