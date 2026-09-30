package Operators_02;

import java.util.Scanner;

public class Biggest_of_Three_Using_Ternary_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();


        // Ternary Operators
        int result = (firstNumber > secondNumber && firstNumber > thirdNumber) ? firstNumber :
                (secondNumber > thirdNumber) ? secondNumber : thirdNumber;

        // printing output
        System.out.print("Biggest of Three: "+result);
    }
}
