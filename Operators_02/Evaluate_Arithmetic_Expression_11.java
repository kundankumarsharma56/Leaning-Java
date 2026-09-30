package Operators_02;

import java.util.Scanner;

public class Evaluate_Arithmetic_Expression_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firstNum: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the secondNum: ");
        int secondNum = sc.nextInt();

        System.out.println("===================Output=======================");
        // Printing the output with Evaluate
        System.out.println("Addition of two number: "+(firstNum + secondNum));
        System.out.println("Subtraction of two number: "+(firstNum - secondNum));
        System.out.println("Multiplication of two number: "+(firstNum * secondNum));
        System.out.println("Divide of two number: "+(firstNum / secondNum));
        System.out.println("Modulo of two number: "+(firstNum % secondNum));
    }
}
