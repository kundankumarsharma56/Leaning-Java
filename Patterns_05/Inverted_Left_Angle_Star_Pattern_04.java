package Patterns_05;

import java.util.Scanner;

public class Inverted_Left_Angle_Star_Pattern_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        Inverted_Left_Angle_Star(number);
    }

    private static void Inverted_Left_Angle_Star(int number) {
        for (int i = 1; i <= number; i++) {

            // space
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }

            // printing start
            for (int j = 1; j <= number-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
