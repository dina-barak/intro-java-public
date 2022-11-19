package chapter04methods.methods;

class MethodReturn {

    public static void main(String[] args) {
        int result;
        result = square(10);
        System.out.println("Squared value of 10 is: " + result);

        System.out.println("Squared value of 20 is: " + square(20));
    }

    public static int square(int num) {
        return num * num;
    }
}