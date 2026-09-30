package Basics_01;

import java.util.Scanner;

public class Celsius_To_Fahrenheit_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Celsius: ");
        int celsius = sc.nextInt();

        double Fahrenheit = ((double) (celsius * 9) /5) + 32;

        System.out.print("Celsius to Fahrenheit is: "+Fahrenheit);
    }
}
