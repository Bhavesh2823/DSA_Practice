package NimapPYQ;

import java.util.Scanner;

public class ABCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ABCheck(sc.nextLine()));
    }

    public static String ABCheck(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.charAt(i) == 'a') {
                if (str.charAt(i + 4) == 'b') {
                    return "true";
                }
            }
            if (str.charAt(i) == 'b') {
                if (str.charAt(i + 4) == 'a') {
                    return "true";
                }
            }
        }
        return "false";
    }
}
