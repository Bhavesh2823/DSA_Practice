package NormalExampkes;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println(findLengthOfLastWord(str));
    }

    public static int findLengthOfLastWord(String str) {
        int count = 0;
        int i = str.length() - 1;

        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
