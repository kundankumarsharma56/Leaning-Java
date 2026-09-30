package Patterns_05;

import java.util.Scanner;

public class Diamond_Star_Pattern_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        Diamond_Star(number);
    }

    private static void Diamond_Star(int number) {
        for (int i = 1; i <= number; i++) {
            // spaces loop
            for(int s = 1; s <= 2 * (number - i);
                s++) {
                System.out.print(" "); //one space
            }
            // stars loop
            for(int j = 1; j <= 2 * i - 1;
                j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //rows loop (for lower part)
        for(int i=1; i <= number - 1; i++) {
            // spaces loop
            for(int s = 1; s <=2 * i; s++) {
                System.out.print(" "); //one space
            }
            // stars loop
            for(int j = 1; j <= 2 *(number - i) -
                    1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
