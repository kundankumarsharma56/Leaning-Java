package Arrays_06.ArrayProblem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remove_Array_Duplicates_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size of array
        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        // Created Array
        System.out.print("Enter the Elements of Array: ");
        int[] elements = new int[sizeOfArray];

        // Taking input from user
        for (int i = 0; i < sizeOfArray; i++) {
            elements[i] = sc.nextInt();
        }
        sc.close();

        // calling method
        Remove_Array_Duplicates(elements);
    }

    private static void Remove_Array_Duplicates(int[] elements) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        // for each loop
        for (int element : elements) {
            set.add(element);
        }
        System.out.println("The given array elements : ");
        System.out.println(Arrays.toString(elements));
        System.out.println("The elements in the array after removing the duplicates :");
        System.out.println(set);
    }
}
