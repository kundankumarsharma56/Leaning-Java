package Operators_02;

import java.util.Scanner;

public class Evaluate_Logical_Expression_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int thirdNumber = sc.nextInt();

        // Print output And Evaluate Logical Expression
        System.out.println("AND Logical Expression: "+(firstNumber == secondNumber && firstNumber == thirdNumber));
        System.out.println("OR Logical Expression: "+(firstNumber == secondNumber || firstNumber == thirdNumber));
        System.out.println("NOT Logical Expression: "+(firstNumber != secondNumber));
    }
}
