/*
Problem Statement:
In a distant kingdom, a wise king has a chest full of magical numbers. He decides to reward the
most observant mathematician in the land. Your task is to analyze a list of these numbers and
identify which ones contain an even number of digits. The king believes that only numbers with
an even number of digits hold the key to unlock the hidden treasures of the kingdom. Can you
help identify these numbers for the king?
Constraints:
● The array length 1≤n≤10^4
● Each number in the array is a positive integer 1≤num≤10^9
Sample Input:
123,4567,89,1001,22
Sample Output:
4567, 89, 1001, 22
Explanation:
Numbers like 123 have 3 digits, which is odd, so they are excluded. However, 89 and 22 have 2
digits, which is even, so they are included.
2. Making Anagrams
Problem Statement:
Alice is attending a cryptography class and has discovered */

package DelloitePYQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberWithEvenDigits {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number: ");
        int[] arr = { 123, 4567, 89, 1001, 223 };
        // int num = sc.nextInt();
        System.out.println(findEvenDigitNumbers(arr));
    }

    public static ArrayList<Integer> findEvenDigitNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            int n = num;
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                list.add(n);
            }
        }
        return list;
    }
}
