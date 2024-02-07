package chapter03arrays.quizes;

/**
 * While empty body. Will stop when i turnes negative
 */
public class QuizWhile {
    public static void main(String[] args) {
        int i = 2140000000;
        while(i < ++i){}
        System.out.println(i);
        System.out.println("out of while loop. i = " + i);
        /*
        char c1 = 'a';
        while (c1 ++ < 'e')
            System.out.println(c1);
        */
    }
}
