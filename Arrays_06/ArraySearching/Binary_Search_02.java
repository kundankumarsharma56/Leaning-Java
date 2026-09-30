package Arrays_06.ArraySearching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size of array
        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        // Take input of finding key
        System.out.print("Enter the key to find in array: ");
        int keyToFind = sc.nextInt();

        // Created Array
        System.out.print("Enter the Elements of Array: ");
        int elements[] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            elements[i] = sc.nextInt();
        }

        Arrays.sort(elements);
        SearchingKey(keyToFind, elements);
    }

    private static void SearchingKey(int keyToFind, int[] elements) {
        int low = 0;
        int high = elements.length-1;
        boolean found = false;


        while (low <= high){
            int mid = low + (high - low) / 2;
            if (elements[mid] == keyToFind) {
                System.out.print("Key found at index: " + mid + " (Value: " + elements[mid] + ")");
                found = true;
                break;
            }
            if (elements[mid] < keyToFind){
                low  = mid + 1;
            }else {
                high = mid - 1;
            }
        }   // End While loop
        if (!found) {
            System.out.print("Key " + keyToFind + " not found in the array.");
        }
    }
}
