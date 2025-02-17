package NormalExampkes;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        char[] charArr = str.toCharArray();
        for (char ch : charArr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
