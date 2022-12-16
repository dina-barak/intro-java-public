package chapter06recursion;

public class Recursion4Spiderman {

    public static void main(String[] args) {

        System.out.println(spiderman(7));
    }

    public static int spiderman(int n){
        int output;
        if (n == 0 | n == 1)
            output = 1;
        else
            output = spiderman(n-1)+spiderman(n-2);
        return output;
    }




}
