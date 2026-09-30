package Conditional_03;

import java.util.Scanner;

public class Biggest_Of_Three_Numbers_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();

        sc.close();

        if ( firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(firstNumber + " is big");
            }
            else {
                System.out.println(thirdNumber + " is big");
            }
        }
        else if ( secondNumber > thirdNumber) {
            System.out.println(thirdNumber + " is big");
        }
        else  {
            System.out.println(thirdNumber + " is big");
        }
    }
}
