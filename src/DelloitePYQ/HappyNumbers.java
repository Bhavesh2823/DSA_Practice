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
import java.util.Scanner;

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
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int rem;
            int sq = 0;
            while (i > 0) {
                rem = i % 10;
                sq = sq * 10 + rem * rem;
                i /= 10;
            }
        }

        return result;
    }

}
