package Conditional_03;

import java.util.Scanner;

public class Classify_Triangle_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the Width: ");
        double width = sc.nextDouble();

        // 1. VALIDITY CHECK: Sum of any two sides must be STRICTLY GREATER than the third side
        if ((height + base <= width) || (base + width <= height) || (height + width <= base) ||
                height <= 0 || base <= 0 || width <= 0) {
            System.out.print("Invalid Triangle");
        }

        // 2. EQUILATERAL CHECK: All three sides are equal
        else if (height == base && base == width) {
            System.out.print("Equilateral");
        }
        // 3. ISOSCELES CHECK: Any two sides are equal
        else if (height == base || base == width || height == width) {
            System.out.print("Isosceles");
        }
        // 4. SCALENE CHECK: All sides are completely different
        else {
            System.out.print("Scalene");
        }
    }
}
