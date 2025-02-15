package NormalExampkes;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println("Number is prime no: " + ans);
    }

    static boolean isPrime(int num) {
        int c = 2;

        if (num <= 1) {
            return false;
        }

        while (c < num) {
            if (c % num == 0) {
                return false;
            } else {
                c++;
            }
        }
        return true;
    }
}
