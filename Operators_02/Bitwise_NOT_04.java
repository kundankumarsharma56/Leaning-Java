package Operators_02;

import java.util.Scanner;

public class Bitwise_NOT_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of A: ");
        int a = sc.nextInt();

        sc.close();

        int result = ~a;
        System.out.println("Bitwise NOT: "+result);
    }
}
