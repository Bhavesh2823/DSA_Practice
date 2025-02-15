/* 6. Sort Words Based on Embedded Numbers
Problem Statement:
A peculiar list of words has been found, where each word contains an embedded number
indicating its position in the correct order. Your task is to rearrange the words in the correct order
based on these embedded numbers. For example, "is2" and "Th1is" should be placed in the
correct sequence based on their numbers. Can you sort the list and reveal the correct sequence
of words?
Constraints:
● The length of the list is 1≤n≤1000
● Each word contains exactly one digit indicating its position (1-9).
Sample Input:
["is2", "a3", "Th1is"]
Sample Output:
This is a
Explanation:
The word "This" contains 1, so it comes first, followed by "is" and then "a". */

package DelloitePYQ;

import java.util.Arrays;

public class WordSortingByNumbers {
    public static void main(String[] args) {
        String strArr[] = { "a3", "th1is", "i2s", "bana4na" };
        System.out.println(Arrays.toString(sortWords(strArr)));
    }

    public static String[] sortWords(String[] arr) {
        String newArr[] = new String[arr.length];

        for (String str : arr) {
            char[] charArr = str.toLowerCase().toCharArray();
            for (char ch : charArr) {
                if (Character.isDigit(ch)) {
                    newArr[ch - '0' - 1] = str.replaceAll("\\d", "");
                }
            }
        }

        return newArr;
    }
}
