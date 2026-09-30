package Arrays_06;

import java.util.Scanner;

public class Sum_Array_Elements_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int sizeOfArray = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int []arr = new  int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sum of Elemets of array: "+ sumOfElements(arr));
    }

    private static int sumOfElements(int[] arr) {
        int sum = 0;

        for (int x : arr){
            sum += x;
        }
        return sum;
    }
}
