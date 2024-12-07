package chapter04methods.methods;

/**
 * Overview and recall:  method invocation,
 *  method declaration,
 * return-value and parameters
 */
public class MethodOverview2 {
    public static void main(String[] args) {
        method1();
        System.out.println("back to main!!\n");
        method2(5);
        System.out.println("back to main!!\n");
        int a = method3(7);
        System.out.println("back to main!!  a = " + a);
    }
    public static void method1(){
        System.out.println("""
                in method Method1
                in class MethodOverview
                in package chapter04methods.methods\n""");
    }
    public static void method2(int a){ System.out.println("in method Method2: parameter a = " + a +
            """
            \nin class MethodOverview
            in package chapter04methods.methods\n""");
    }
    public static int method3(int a){
        System.out.println("Method3: parameter a = " + a);
        return a * a;
    }

}
