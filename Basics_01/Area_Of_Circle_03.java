package Basics_01;

import java.util.Scanner;

public class Area_Of_Circle_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double radius = sc.nextDouble();

        System.out.println("Area of circle is: "+(Math.PI * radius * radius));
    }
}
