/*
Problem Statement:
Alice is attending a cryptography class and has discovered that anagrams can be very useful.
She is working on an encryption scheme that involves two large strings. The encryption is
dependent on determining the minimum number of character deletions required to turn the
two strings into anagrams.
Two strings are considered anagrams if the letters of one string can be rearranged to form the
other string, meaning both strings must contain the same exact letters in the same exact
frequencies.
Given two strings, your task is to calculate the minimum number of deletions required to make
them anagrams. Characters can be deleted from either string.
Constraints:
● Both strings consist only of lowercase English letters (a to z).
● The lengths of the strings can vary but will not exceed ten to the power of four.
Input Format:
● The first line contains the first string.
● The second line contains the second string.
Output Format:
● Print a single integer denoting the minimum number of character deletions required to
make the strings anagrams.
Sample Input:
cde
abc
Sample Output:
4
Explanation:
To make the strings anagrams:
● Remove d and e from "cde" to get "c".
● Remove a and b from "abc" to get "c".
This results in a total of 4 deletions. */

package DelloitePYQ;

import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter str2: ");
        String str2 = sc.nextLine();
        System.out.println(findDeletionNo(str1, str2));
    }

    public static int findDeletionNo(String str1, String str2) {
        char[] strArr1 = str1.toLowerCase().toCharArray();
        char[] strArr2 = str2.toLowerCase().toCharArray();
        int deletionCount = 0;
        for (char i : strArr1) {
            int iOccurance = 0;
            for (char j : strArr2) {
                if (j == i) {
                    iOccurance++;
                }
            }
            if (iOccurance == 0 || iOccurance > 1) {
                deletionCount++;
            }
        }
        for (char i : strArr2) {
            int iOccurance = 0;
            for (char j : strArr1) {
                if (j == i) {
                    iOccurance++;
                }
            }
            if (iOccurance == 0 || iOccurance > 1) {
                deletionCount++;
            }
        }

        return deletionCount;
    }
}
