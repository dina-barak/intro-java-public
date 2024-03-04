package chapter05strings;

/**
 * Cesar code example for strings
 */
public class CesarCode {
    public static void main(String[] args) {
        String str = "java strings z";
        int key = 1;

        String encrypted = encrypt(str, key);
        System.out.println(encrypted); // "kbwb tusjoht a"

        String decrypted = decrypt(encrypted, key);
        System.out.println(decrypted); // "java strings z"

    }

    /**
     * Cesar encoding
     * @param str String to code
     * @param key shift of letters
     * @return coded string
     */
    public static String encrypt(String str, int key) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans = ans + cypher(str.charAt(i),key);
        }
        return ans;
    }

    /**
     * Decrypt string
     * @param str String to decrypt
     * @param key shift in letters
     * @return decrypt string
     */
    public static String decrypt(String str, int key) {
        return encrypt(str, 'z' - 'a' + 1 - key);
    }

    /**
     * Cypher a character
     * @param c character ascii
     * @param key shift of character
     * @return shifted character
     */
    public static char cypher(int c, int key){
        if ('A' <= c && c <= 'Z') {
            c = c - 'A';
            c = c + key;
            c = c % ('Z' - 'A' + 1);
            return (char) (c + 'A');
        }
        else if ('a' <= c && c <= 'z') {
            return (char) (((c - 'a' + key) % ('z' - 'a' + 1)) + 'a');
        }
        else return (char)c;
    }

}
