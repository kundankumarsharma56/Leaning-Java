package Loops_04;

import java.util.Scanner;

public class Factorial_Of_Number_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of finding factorial: ");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Number of Factorial: "+factorial);
    }
}
