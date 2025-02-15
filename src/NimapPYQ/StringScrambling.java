package NimapPYQ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringScrambling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Scrumble: ");
        String str = sc.nextLine();
        String scrumbledString = toScrumbledString(str);
        System.out.println(scrumbledString);
    }

    public static String toScrumbledString(String str) {
        ArrayList<Character> characters = new ArrayList<>();

        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            characters.add(c);
        }

        Collections.shuffle(characters);

        StringBuilder scrambledString = new StringBuilder();

        for (char c : characters) {
            scrambledString.append(c);
        }

        return scrambledString.toString();

    }
}
