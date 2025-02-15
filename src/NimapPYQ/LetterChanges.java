package NimapPYQ;

import java.util.Scanner;

public class LetterChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your str: ");
        String str = sc.nextLine();
        System.out.println(letterChange(str));
    }

    public static String letterChange(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                char newChar = (char) (c + 1);

                if (newChar > 'z') {
                    newChar = 'a';
                }

                if (newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u') {
                    newChar = Character.toUpperCase(newChar);
                }

                newStr = newStr + newChar;
            } else {
                newStr = newStr + c;
            }
        }
        return newStr;
    }
}
