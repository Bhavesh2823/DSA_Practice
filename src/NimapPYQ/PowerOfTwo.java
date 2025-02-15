package NimapPYQ;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(powerOfTwo(num));
    }

    public static String powerOfTwo(int num) {
        while (num > 1) {
            if (num % 2 != 0) {
                return "false";
            }
            num /= 2;
        }
        if (num <= 0) {
            return "false";
        }

        return "true";
    }
}
