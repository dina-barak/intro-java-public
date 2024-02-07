package chapter03arrays.quizes;

/**
 * Demonstrate operator like --/++/+= on characters
 * Comment lines: c = c - 1 will not compile
 */
public class QuizNestedForChar {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (char c = 'z'; c >= 'a'; c--)
                System.out.print(c + " ");
            System.out.println();
        }
        /*
        char c = 'c';
        c ++;
        System.out.println("(int)c = " + (int)c + ", c = " + c);
        c += 1;
        System.out.println("(int)c = " + (int)c + ", c = " + c);
        c = (char)(c + 1);
        System.out.println("(int)c = " + (int)c + ", c = " + c);
        */
    }
}
