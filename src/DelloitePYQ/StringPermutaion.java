/* 12. Check if Two Strings are Permutations
Problem Statement:
Two friends, Alice and Bob, were given two strings and challenged to check if one is a
permutation of the other. Alice insists that a permutation should contain the same characters but
in a different order. Bob, on the other hand, is skeptical. Can you help them by determining if
one string is a permutation of the other?
Constraints:
● The length of both strings is 1≤n≤10^5.
● The strings consist of uppercase and lowercase English alphabets.
Sample Input:
"abc", "cab"
Sample Output:
True
Explanation:
Both strings contain the same characters in different orders, so they are permutations of each
other */

package DelloitePYQ;

import java.util.Arrays;
import java.util.Scanner;

import javax.script.ScriptEngine;

public class StringPermutaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.nextLine();
        System.out.println(checkStringPermutation(str1, str2));
    }

    public static boolean checkStringPermutation(String str1, String str2) {

        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        if (Arrays.equals(charArr1, charArr2)) {
            return true;
        } else {
            return false;
        }
    }
}
