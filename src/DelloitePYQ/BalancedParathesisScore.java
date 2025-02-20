/*13. Determine the Score of Balanced Parentheses
Problem Statement:
In a world of balanced equations, mathematicians have designed a set of parentheses rules.
Each pair of balanced parentheses has a score based on its depth, where deeper pairs have
higher scores. Your task is to calculate the total score of the balanced parentheses string, where
each pair of parentheses has a score equal to the sum of its score at that depth. Can you help
them evaluate the score of the parentheses?
Constraints:
● The length of the parentheses string is 1≤n≤1000.
● The string only contains '(' and ')'.
Sample Input:
"(()())"
Sample Output:
6
Explanation:
The score of the string is calculated as follows: the outermost pair contributes 2, and the inner
pair contributes 4, making the total score 6.*/

package DelloitePYQ;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParathesisScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Parentheses: ");
        String str = sc.nextLine();
        System.out.println(calculateScore(str));
    }

    public static int calculateScore(String str) {
        char[] charArr = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : charArr) {
            if (ch == '(') {
                stack.push(0);
            } else {
                int last = stack.pop();
                int top = stack.pop();
                stack.push(top + Math.max(2 * last, 1));
            }
        }
        return stack.pop();
    }
}
