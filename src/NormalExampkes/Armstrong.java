package NormalExampkes;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean ans = armstrong(num);
        System.out.print(num + " is a Armstrong number: " + ans);
    }

    static boolean armstrong(int num) {
        int n = num;
        int rem;
        int cube;
        int sum = 0;

        while (num > 0) {
            rem = num % 10;
            cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
        }

        return n == sum;
    }
}