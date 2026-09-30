package Basics_01;

import java.util.Scanner;

public class Explicit_Type_Casting_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int value: ");
        int intValue = sc.nextInt();
        System.out.println("Enter the double value: ");
        double doubleValue = sc.nextDouble();

        // Sum of both value
        int finalValue = intValue + (int) doubleValue;
        System.out.println("Sum of both value: "+finalValue);

        // Type Casting Force fully, Loss some Data
        intValue = (int) doubleValue;
        System.out.println("double : " + doubleValue + " is converted to int : " + intValue);

    }
}
