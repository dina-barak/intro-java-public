package chapter04methods.methods;

class MethodInvocation {
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        int result = addNumbers(num1, num2);
        System.out.println(result);
    }
}