package Patterns_05;

import java.util.Scanner;

public class Inverted_Right_Angle_Star_Pattern_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        Inverted_Right_Angle_Star(number);
    }

    private static void Inverted_Right_Angle_Star(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
