package NimapPYQ;

import java.util.Scanner;

public class LongestWordInSetence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen = sc.nextLine();
        System.out.println("Longest word: " + longestWord(sen));
    }

    public static String longestWord(String sen) {
        String[] words = sen.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        String longest = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longest = word;
                maxLength = word.length();
            }
        }
        return longest;
    }
}
