package NormalExampkes;

import java.util.Arrays;

public class RevString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        revString(s);
    }

    public static void revString(char[] s) {
        char[] revArr = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            revArr[s.length - 1 - i] = s[i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
