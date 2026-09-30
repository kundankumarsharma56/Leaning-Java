package Operators_02;

import java.util.Scanner;

public class Unsigned_Right_Shift_Negative_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter positions to shift: ");
        int shift = sc.nextInt();

        sc.close();

        int result = number >>> shift;
        System.out.println("Perform an unsigned right shift with a negative number.: "+result);
    }
}
