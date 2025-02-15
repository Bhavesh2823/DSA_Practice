package NormalExampkes;
import java.util.Scanner;

public class CheckNoOfOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the occurance no: ");
        int ono = sc.nextInt();

        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == ono) {
                count++;
            }
            num /= 10;
        }
        System.out.println("No. of Occurances are: " + count);
    }
}
