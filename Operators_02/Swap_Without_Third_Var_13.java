package Operators_02;

import java.util.Scanner;

public class Swap_Without_Third_Var_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firstNumber: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the secondNumber: ");
        int secondNumber = sc.nextInt();
        sc.close();

        // Print value Before swaping
        System.out.println("========Before Swap========");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);

        // Swap two numbers without a third variable using arithmetic operations.
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        // Print value after swaping
        System.out.println("========After Swap========");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);
    }
}
