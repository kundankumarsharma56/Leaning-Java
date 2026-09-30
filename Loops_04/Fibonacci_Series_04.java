package Loops_04;

import java.util.Scanner;

public class Fibonacci_Series_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number Fibonacci Series: ");
        int lastNum_Fibonacci = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i <= lastNum_Fibonacci; ++i) {
            System.out.print(firstTerm+", ");

            int nextTerm = firstTerm + secondTerm;
            secondTerm = firstTerm;
            firstTerm = nextTerm;
        }
    }
}
