package chapter05strings;

public class String1ToInt {
    public static void main(String[] args) {
        System.out.println(toInt("0xA2F7"));
    }

    public static int toInt(String s) {
        int base; // 8,10 or 16
        int first;// Where does the number part start
        int value = 0, power = 1;

        if (s.charAt(0) != '0' | s.length()==1) // base 10
        { first=0; base=10;}
        else if (s.charAt(1)!='x') // base 8
        { first=1; base=8;}
        else // base 16
        { first=2; base=16;}

        for (int i = s.length()-1; i >= first; i = i-1){
            value = value + toInt(s.charAt(i)) * power;
            power = power * base;
        }
        return value;
    }

    public static int toInt(char c)
    {
        return "0123456789ABCDEF".indexOf(c) ;
    }

}
