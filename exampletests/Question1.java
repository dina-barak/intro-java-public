package exampletests;

/**
 * 3.5
 * a23
 * 5
 * 20
 * 3
 */
public class Question1
{
    public static void main(String[] args)
    {
        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
        f7();
        f8();
    }
    public static void f1()
    {
        int i = 5;
        double d = i;
//        int j = d;
//        System.out.println(j);
    }
    public static void f2()
    {
        int i = 2;
        double d = (int) 7.8;
        System.out.println(d / i);
    }
    public static void f3()
    {
        System.out.println("a" + 2 + 3);
    }
    public static void f4()
    {
        for (int i = 0; i < 5; i = i + 1) {
            i = i + 1;
        }
        //System.out.println(i);
    }
    public static void f5()
    {
        int[] a = new int[0];
        //System.out.println(a[0]);
    }
    public static void f6()
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20};
        swap(a, b);
        System.out.println(a.length);
    }
    public static void f7()
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20};
        swap(a, b, 1);
        System.out.println(a[1]);
    }
    public static void f8()
    {
        int[] a = {1, 2, 3, 4, 5};
        multiply(a, 5);
        System.out.println(a[2]);
    }
    public static void swap(int[] a, int[] b)
    {
        int[] tmp = a;
        a = b;
        b = tmp;
    }
    public static void swap(int[] a, int[] b, int i)
    {
        int tmp = a[i];
        a[i] = b[i];
        b[i] = a[i];
    }
    public static void multiply(int[] a, int factor)
    {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++)
            b[i] = a[i] * factor;
        a = b;
    }
}

