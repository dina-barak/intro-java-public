package chapter06recursion;

public class Recursion7PrintAllCombinationsB {
    public static void main(String[] args) {
        combinations("{","1234",2);
    }
    public static void combinations(String preString, String fromStr, int k){
        if (k == 0) System.out.println(preString + " }");
        else {
            for (int i = 0; i < fromStr.length(); i++) {
                String charString = String.valueOf(fromStr.charAt(i));
                String newFromStr = fromStr.replaceAll(charString,"");
                combinations(preString + " " + fromStr.charAt(i),newFromStr,k-1);
            }
        }
        
    }
}
