package Arrays_06.ArraySearching;

import java.util.Scanner;

public class LinearSearch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of array: ");
        int sizeOfArray = scanner.nextInt();

        System.out.print("Enter the key number: ");
        int keyNumber = scanner.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }

        linerSearching(arr, keyNumber);
    }

    private static void linerSearching(int[] arr, int keyNumber) {

        boolean isFound = false;

        for (int j : arr) {
            if (j == keyNumber) {
                System.out.println("This number present in this array: " + keyNumber);
                isFound = true;
                break;
            }
        }

        // Check after the loop if the number was never found
        if (!isFound) {
            System.out.println("No, This number not present in this array: " + keyNumber);
        }
    }
}
