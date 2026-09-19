package ExceptionHandling;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber  = sc.nextInt();

        System.out.println("Enter the second Number: ");
        int secondNumber = sc.nextInt();
        sc.close();
        int div = 0;
        try {
            div = firstNumber / secondNumber;
            System.out.println("Divide of two number: "+div);
        } catch ( ArithmeticException e ) {
            e.printStackTrace();
        }
    }
}
