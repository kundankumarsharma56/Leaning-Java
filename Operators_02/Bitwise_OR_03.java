package Operators_02;

import java.util.Scanner;

public class Bitwise_OR_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of A: ");
        int a = sc.nextInt();

        System.out.println("Enter the number of B: ");
        int b = sc.nextInt();

        sc.close();

        int result = a | b;
        System.out.println("Bitwise OR: "+result);
    }
}
