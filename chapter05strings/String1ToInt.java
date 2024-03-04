package chapter05strings;

/**
 * Converts string of decimal, base-8 and base-16
 * to int
 */
public class String1ToInt {
    public static void main(String[] args) {
        System.out.println(toInt("485"));
        System.out.println(toInt("0657"));
        System.out.println(toInt("0xA2F7"));
    }

    /**
     * Convert from string to number
     * Decimal, base-8 and base-16 numbers
     * @param s String of number
     * @return int value of number
     */
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

    /**
     * Convert character to int
     * @param c char to convert
     * @return int the values of the digit
     */
    public static int toInt(char c)
    {
        return "0123456789ABCDEF".indexOf(c) ;
    }

}
