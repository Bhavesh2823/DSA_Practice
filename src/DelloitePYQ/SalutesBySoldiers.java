/*5. Calculate Salutes Exchanged by Soldiers
Problem Statement:
In a grand military parade, soldiers march in a straight line. Some soldiers are facing left, while
others are facing right. Every time a soldier facing right comes across a soldier facing left, they
exchange a salute. Your task is to calculate how many salutes happen in total. Can you
determine the total number of salutes based on the arrangement of soldiers in the parade?
Constraints:
● The length of the string is 1≤n≤1000
● The string consists of '>' and '<' characters only, representing soldiers facing right and
left, respectively.
Sample Input:
"><<<>"
Sample Output:
2
Explanation:
There are two salutes: one between the first '>' and the first '<', and the second between the
third '>' and the third '<'.
 */

package DelloitePYQ;

import java.util.Scanner;

public class SalutesBySoldiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        System.out.println(calculateSalute(sc.nextLine()));
    }

    static int calculateSalute(String str) {
        int salutes = 0;
        int length = str.length() - 1;
        // int rightCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i + 1) == '<') {
                if (str.charAt(i) == '>') {
                    salutes++;
                }
            }
            if (str.charAt(i + 1) == '>') {
                if (str.charAt(i) == '<') {
                    salutes++;
                }
            }
        }

        return salutes;
    }
}
