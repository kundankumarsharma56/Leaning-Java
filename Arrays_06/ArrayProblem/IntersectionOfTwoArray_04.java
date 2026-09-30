package Arrays_06.ArrayProblem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IntersectionOfTwoArray_04 {
    public static void main(String[] args) {
        // connect Scanner to the keyboard input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int size = scan.nextInt();
        // create array
        int[] arr1 = new int[size];

        System.out.println("Enter the elements in the array1");
        for (int i = 0; i < size; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the size of array2");
        int size2 = scan.nextInt();
        // create array
        int[] arr2 = new int[size2];

        System.out.println("Enter the elements in the array2");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scan.nextInt();
        }

        findIntersection(arr1, arr2);
        scan.close();
    }

    private static void findIntersection(int[] arr1, int[] arr2) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        int []arr3;
        if (arr1.length < arr2.length){
            arr3 = new int[arr1.length];
        }else {
            arr3 = new int[arr2.length];
        }
        for (int element : arr1) {
            set.add(element);
        }
        int index = 0;
        for (int x : arr2) {
            if (set.contains(x)) {
                arr3[index++] = x;
            }
        }
        System.out.println("The elements in array1 : " + Arrays.toString(arr1));
        System.out.println("The elements in array2 : " + Arrays.toString(arr2));
        System.out.println("The intersection elements : " );

        for (int i = 0; i < index; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
