package chapter04methods.methods;

/**
 * Overview and recall:  method invocation,
 *  method declaration,
 * return-value and parameters
 */
public class MethodOverview1 {
    public static void main(String[] args) {
        method1();
        System.out.println("back to main!!");
        method2(5);
        System.out.println("back to main!!");
        int a = method3(7);
        System.out.println("back to main!!  a = " + a);
    }
    public static void method1(){
        System.out.println("Method1");
    }
    public static void method2(int a){ System.out.println("Method2: parameter a = " + a);
    }
    public static int method3(int a){
        System.out.println("Method3: parameter a = " + a);
        return a * a;
    }

}
