package Operators_02;

import java.util.Scanner;

public class Swap_Using_XOR_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        // Before swap print value
        System.out.println("====Before Swap====");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);

        // Swap using XOR ^ Operator
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = secondNumber ^ firstNumber;
        firstNumber = firstNumber ^ secondNumber;

        // After Swap print value
        System.out.println("====After Swap====");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);
    }
}
