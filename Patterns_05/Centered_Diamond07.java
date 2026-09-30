package Patterns_05;

import java.util.Scanner;

public class Centered_Diamond07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        CenteredDiamond(num);
    }

    private static void CenteredDiamond(int num) {
        for (int i = 0; i < num; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < num - i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= num; i++) {
            for (int space = 0; space < num - i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
