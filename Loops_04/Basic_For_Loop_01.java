package Loops_04;

import java.util.Scanner;

public class Basic_For_Loop_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int endingNumber = sc.nextInt();

        for (int i = 1; i <= endingNumber; i++) {
            System.out.println("Number: "+i);
        }
        sc.close();
    }
}
