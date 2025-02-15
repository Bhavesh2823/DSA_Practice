/*
Problem Statement:
A mysterious letter arrives at your doorstep containing a cryptic message. The letter reads:
"Decode the message to reveal the treasure." The message is encoded using nested repetition,
such as "2[a3[b]]", where numbers indicate the number of repetitions. Your task is to decode
such messages. For instance, "2[a3[b]]" expands to "abbbabbb". Can you solve this puzzle and
unveil the treasure?
Constraints:
● The encoded string contains only alphanumeric characters, square brackets, and digits.
● The maximum nesting level is 100.
● The length of the encoded string does not exceed 10^4.
Sample Input:
"3[a2[bc]]"
Sample Output:
"abcbcabcbcabcbc"
Explanation:
The innermost part "2[bc]" expands to "bcbc". Then, "3[a2[bc]]" expands to "abcbcabcbcabcbc". */

package DelloitePYQ;

import java.util.Scanner;
import java.util.Stack;

public class DecodeNestedEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nested Encoded String: ");
        String encodedStr = sc.nextLine();
        System.out.println(decodeNestedEncoding(encodedStr));
    }

    public static String decodeNestedEncoding(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int index = 0;

        while (index < str.length()) {
            char ch = str.charAt(index);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(str.charAt(index))) {
                    num = num * 10 + (str.charAt(index) - '0');
                    index++;
                }
                countStack.push(num);
            } else if (ch == '[') {
                resultStack.push(current);
                current = new StringBuilder();
                index++;
            } else if (ch == ']') {
                StringBuilder temp = current;
                current = resultStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    current.append(temp);
                }
                index++;
            } else {
                current.append(ch);
                index++;
            }
        }
        return current.toString();
    }
}
