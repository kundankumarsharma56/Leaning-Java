package Patterns_05;

import java.util.Scanner;

public class Left_Angle_Star_Pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        Left_Angle_Star(number);
    }

    private static void Left_Angle_Star(int number) {
        for (int i = 1; i <= number; i++) {
            for (int space = 1; space <= number - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
