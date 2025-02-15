/* 8. Return a String with Repeated Words Based on Embedded Counts
Problem Statement:
You have received a list of words, each with a number embedded indicating how many times
that word should be repeated. Your task is to construct a new string by repeating each word the
specified number of times. For example, the word "hello3" should be repeated 3 times. Can you
generate the final string based on this pattern?
Constraints:
● The number of words is 1≤n≤100.
● Each word contains exactly one number indicating how many times it should be
repeated.
Sample Input:
["hello3", "world2"]
Sample Output:
"hellohellohello worldworld" */

package DelloitePYQ;

import java.util.ArrayList;

public class RepeatWordsBasedOnCount {
    public static void main(String[] args) {
        String[] strArr = { "Hello3", "Wo2rld" };
        System.out.println(repeatWord(strArr));
    }

    public static ArrayList<String> repeatWord(String[] arr) {
        ArrayList<String> newStr = new ArrayList<>();

        for (String str : arr) {
            char[] charArr = str.toCharArray();
            for (char ch : charArr) {
                if (Character.isDigit(ch)) {
                    for (int i = 0; i < ch - '0'; i++) {
                        newStr.add(str.replaceAll("\\d", ""));
                    }
                }
            }
        }
        return newStr;
    }
}
