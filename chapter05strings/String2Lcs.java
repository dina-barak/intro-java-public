package chapter05strings;

public class String2Lcs {

    public static void main(String[] args) {
        System.out.println(lcs("xyzabcd2424", "abcdefg"));
    }

    public static int lcs(String s1, String s2) {
        // assume s1 and s2 are not null
        int ans = 0;
        for (int index1 = 0; index1 < s1.length(); index1 = index1 + 1)
            for (int index2 = 0; index2 < s2.length(); index2 = index2 + 1)
                ans = Math.max(ans, lcs(s1, s2, index1, index2));
        return ans;
    }


    public static int lcs(String s1, String s2, int index1, int index2) {
        //System.out.println(index1 + ": " + index2);
        int ans = 0;
        while ((index1 < s1.length() & index2 < s2.length()) && s1.charAt(index1) == s2.charAt(index2)) {
            index1 = index1 + 1;
            index2 = index2 + 1;
            ans = ans + 1;
        }
        return ans;
    }

}
