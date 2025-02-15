package NormalExampkes;

import java.util.Scanner;

public class ReverseTheNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int num = sc.nextInt();

        int result = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
