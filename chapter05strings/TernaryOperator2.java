package chapter05strings;

public class TernaryOperator2 {
    public static void main(String[] args) {
        System.out.println(absA(5));
        System.out.println(absB(5));
        System.out.println(absC(5));
        System.out.println(absD(5));
    }
    public static double absA(double x){
        return x < 0 ? x:-x;
    }
    public static double absB(double x){
        return x > 0 ? x:-x;
    }
    public static double absC(double x){
        return (x < 0 ? -x:x);
    }
    public static double absD(double x){
        return x > 0 ? -x:x;
    }
}
