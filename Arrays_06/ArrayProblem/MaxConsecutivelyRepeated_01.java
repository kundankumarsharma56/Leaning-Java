package Arrays_06.ArrayProblem;

import java.util.Arrays;
import java.util.Scanner;

public class MaxConsecutivelyRepeated_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size of array
        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        // Created Array
        System.out.print("Enter the Elements of Array: ");
        int elements[] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            elements[i] = sc.nextInt();
        }

        findMaxConsecutivelyRepeated(elements);
        sc.close();
    }

    private static void findMaxConsecutivelyRepeated(int[] elements) {
        int count = 1;
        int max = 0;
        int array = elements[0];

        for (int i = 0; i < elements.length-1; i++) {
            if (elements[i] == elements[i + 1])
                count++;
            else
                count = 1;

            if (count > max){
                max = count;
                array = elements[i];
            }
        }
        System.out.println("The element : " + array + " is max consecutively repeated for : " + max +" times");
    }
}
