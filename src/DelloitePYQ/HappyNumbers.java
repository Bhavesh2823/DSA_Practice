/* 9. Find All Happy Numbers in a Range
Problem Statement:
In a small village, people celebrate their happiness by performing a ritual with numbers. A
number is considered "happy" if the process of repeatedly summing the squares of its digits
eventually leads to 1. For example, the number 19 is happy because 1^2+ 9^2 = 82, 8^2 + 2^2=
68, and so on, eventually reaching 1. Your task is to find all happy numbers in a given range.
Can you help the villagers find their happy numbers?
Constraints:
● The range is between 1 and 10^4.
Sample Input:
1, 20
Sample Output:
[1, 7, 10, 13, 19]
Explanation:
The happy numbers between 1 and 20 are 1, 7, 10, 13, and 19. */

package DelloitePYQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your range");
        System.out.println("Enter Start: ");
        int start = sc.nextInt();
        System.out.println("Enter End: ");
        int end = sc.nextInt();
        System.out.println(findHappyNumbers(start, end));
    }

    public static ArrayList<Integer> findHappyNumbers(int start, int end) {

        ArrayList<Integer> happyList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                happyList.add(i);
            }
        }

        return happyList;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = findSumOfDigitSq(n);
        }

        return n == 1;
    }

    public static int findSumOfDigitSq(int n) {
        int digit, sum = 0;
        while (n > 0) {
            digit = n % 10;
            sum = sum + digit * digit;
            n /= 10;
        }
        return sum;
    }

}
