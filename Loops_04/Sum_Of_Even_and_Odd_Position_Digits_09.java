package Loops_04;

import java.util.Scanner;

public class Sum_Of_Even_and_Odd_Position_Digits_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        sumOfEvenOddPosition(number);
    }

    private static void sumOfEvenOddPosition(int number) {

        int evenPosition = 0;
        int oddPosition = 0;

        String str = String.valueOf(number);
        int count = str.length();

        int position;
        if (count % 2 == 0){
            position = 0;
        }else {
            position = 1;
        }

        while (number > 0){
            int digit = number % 10;

            if (position == 0){
                evenPosition += digit;
                position = 1;
            }else {
                oddPosition += digit;
                position = 0;
            }
            number /= 10;
        }
        System.out.println("The sum of even positions is " + evenPosition);
        System.out.println("The sum of odd positions is " + oddPosition);
    }
}
