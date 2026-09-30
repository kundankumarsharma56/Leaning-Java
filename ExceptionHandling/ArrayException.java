package ExceptionHandling;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int sizeOfArray = sc.nextInt();

        System.out.println("Enter the elements of Arrays: ");
        int []arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index of elements: ");
        int index = sc.nextInt();

        try {
           System.out.println("Elements of array: "+arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
