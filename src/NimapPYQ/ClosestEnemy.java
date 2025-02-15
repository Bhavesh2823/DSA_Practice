package NimapPYQ;

import java.util.Scanner;

public class ClosestEnemy {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 0, 0, 2, 0, 2 }; // Closest enemy is at distance 3
        int[] arr2 = { 1, 0, 0, 0, 0 }; // No enemy
        int[] arr3 = { 2, 0, 1, 0, 2 }; // Closest enemy is at distance 1

        System.out.println(findClosestEnemy(arr3));
    }

    public static int findClosestEnemy(int[] arr) {

        int playerIndex = -1;
        int closestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                playerIndex = i;
                break;
            }
        }

        if (playerIndex == -1) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                int distance = Math.abs(i - playerIndex);
                closestDistance = Math.min(closestDistance, distance);
            }
        }

        return closestDistance == Integer.MAX_VALUE ? -1 : closestDistance;
    }
}
