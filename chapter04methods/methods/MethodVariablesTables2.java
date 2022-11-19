package chapter04methods.methods;

public class MethodVariablesTables2 {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        swap(a, b);
        System.out.println(a); //9
        System.out.println(b); //5
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a); //5
        System.out.println(b); //9
    }
}

