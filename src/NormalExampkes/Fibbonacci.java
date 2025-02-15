package NormalExampkes;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the series: ");
        int n = sc.nextInt();
        fibbonacci(n);
    }

    static void fibbonacci(int n) {
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " " + b);
        while (count <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
            System.out.print(" " + temp);
        }
    }
}
