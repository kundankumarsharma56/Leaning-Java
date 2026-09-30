package Basics_01;

import java.util.Scanner;

public class Sum_Of_Two_Num_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        System.out.println("Sum of two number: "+(firstNum+secondNum));
    }
}
