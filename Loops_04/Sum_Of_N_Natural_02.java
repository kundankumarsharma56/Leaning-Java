package Loops_04;

import java.util.Scanner;

public class Sum_Of_N_Natural_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Last Sum Number: ");
        int lastNumber = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.print("Sum of N natural Number: "+sum);
    }
}
