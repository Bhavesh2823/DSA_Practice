package NimapPYQ;

import java.util.Scanner;

public class ConvertToSnakeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String snakeCase = toSnakeCase(str);
        System.out.println("Snake Case Format is: " + snakeCase);
    }

    public static String toSnakeCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        str = str.trim();

        String snakeCase = str
                .replaceAll("([a-z])([A-Z])", "$1_$2")
                .replaceAll("[\\s\\-]+", "_")
                .toLowerCase();

        return snakeCase;
    }
}
