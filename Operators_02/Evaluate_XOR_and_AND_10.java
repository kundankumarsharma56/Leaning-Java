package Operators_02;

import java.util.Scanner;

public class Evaluate_XOR_and_AND_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of A: ");
        int a = sc.nextInt();

        System.out.print("Enter the number of B: ");
        int b = sc.nextInt();

        sc.close();

        System.out.println("XOR: "+(a ^ b) +" AND: "+(a & b));

    }
}
