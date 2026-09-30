package Patterns_05;

import java.util.Scanner;

public class Pyramid_Star_Pattern_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        Pyramid_Star(number);
    }

    private static void Pyramid_Star(int number) {
        for (int i = 1; i <= number; i++) {
            for (int space = i; space <= number - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
