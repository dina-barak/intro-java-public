package chapter04methods.methods;

public class MethodOverloading3 {
    public static void main(String[] args) {
        System.out.println(5 + 8); // System.out.println(int x)
        System.out.println(5 + 8  + ""); //  System.out.println(String s)
        System.out.println("" + 5 + 8); //  System.out.println(String s)
        String s =  5 + 8 + "";
        System.out.println(s);
    }
}
