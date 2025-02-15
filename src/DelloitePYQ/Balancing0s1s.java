/*
Problem Statement:
A famous mathematician has been studying binary sequences and discovered a fascinating
pattern. He realized that there are certain substrings where the number of 0s is equal to the
number of 1s. Intrigued by this observation, he asks you to help find how many such substrings
exist in a given binary string. The mathematician believes that these balanced substrings can
lead to new discoveries in the world of numbers. Can you find them?
Constraints:
● The length of the binary string is 1≤n≤10^5
● The string only contains characters '0' and '1'.
Sample Input:
"00110011"
Sample Output:
6
Explanation:
The six balanced substrings are: "0011", "01", "1100", "10", "0011", and "01".
 */

package DelloitePYQ;

import java.util.Scanner;

public class Balancing0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary String: ");
        String str = sc.nextLine();
        System.out.println(findBalanceNumber(str));
    }

    public static int findBalanceNumber(String s) {
        int count0 = 0, count1 = 0, balancedSubstrings = 0;

        for (int i = 0; i < s.length(); i++) {
            // Increment counts based on the current character
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }

            // If counts match, we've found a balanced substring
            if (count0 == count1) {
                balancedSubstrings++;
            }
        }

        return balancedSubstrings;
    }
}
