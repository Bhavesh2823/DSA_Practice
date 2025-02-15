package NimapPYQ;

import java.util.Scanner;

public class NumberEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Encode: ");
        String str = sc.nextLine();
        System.out.println("Endcoded Number is: " + encodeString(str));
    }

    public static String encodeString(String str) {
        StringBuilder encodedStr = new StringBuilder();
        char[] charArr = str.toLowerCase().toCharArray();

        for (char c : charArr) {
            if (Character.isLetter(c)) {
                int position = c - 'a' + 1;
                encodedStr.append(position);
            }
        }
        return encodedStr.toString();
    }
}
