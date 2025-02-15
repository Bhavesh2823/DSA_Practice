package NormalExampkes;

import java.util.Scanner;

public class HighestOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No: ");
        int num = sc.nextInt();
        System.out.println("Highest Odd no. is: " + findHighestOddNo(num));
    }

    public static int findHighestOddNo(int num) {
        int highestOdd;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 != 0) {
                return num;
            } else {
                num /= 10;
            }
        }
        return -1;
    }
}
