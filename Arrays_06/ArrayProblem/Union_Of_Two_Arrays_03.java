package Arrays_06.ArrayProblem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Union_Of_Two_Arrays_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int size = scan.nextInt();

        // create array 
        int[] arr1 = new int[size];
        System.out.println("Enter the elements in the array"); 
        for (int i = 0; i < size; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the size of array2");
        int size2 = scan.nextInt();

        // create array 
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements in the array"); 
        for (int i = 0; i < size2; i++) {
            arr2[i] = scan.nextInt();
        }

        findUnion(arr1, arr2);
        scan.close();
    }

    private static void findUnion(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int elements : arr1){
            set.add(elements);
        }

        for (int element : arr2){
            set.add(element);
        }

        System.out.println("Array1 elements : ");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Array2 elements : ");
        System.out.println(Arrays.toString(arr2));

        System.out.println("Union elements : ");
        System.out.println(set);
    }
}
