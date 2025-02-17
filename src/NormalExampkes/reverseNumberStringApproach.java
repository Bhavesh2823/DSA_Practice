package NormalExampkes;

import java.util.Scanner;

public class reverseNumberStringApproach {
    public static int reverse(int x) {
        String str = Integer.toString(x);
        char[] charArr = str.toCharArray();

        int i = 0;
        int j = charArr.length - 1;

        if (charArr[0] == '-') {
            i = 1;
        }

        reverseStr(charArr, i, j);

        long num = Long.parseLong(new String(charArr));

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) num;
    }

    public static void reverseStr(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}
