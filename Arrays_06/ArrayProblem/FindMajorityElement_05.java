package Arrays_06.ArrayProblem;

import java.util.Scanner;

public class FindMajorityElement_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size = scan.nextInt();

        // create array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array");

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int majority = findMajorityElement(arr);
        System.out.println("The majority element is " +
                majority);
        scan.close();

    }

    private static int findMajorityElement(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }

        for (int i = 0; i < arr.length-1; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }

            if ( count > arr.length / 2){
                return arr[i];
            }
        }
        return -1;
    }
}
