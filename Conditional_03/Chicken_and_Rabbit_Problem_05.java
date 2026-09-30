package Conditional_03;

import java.util.Scanner;

public class Chicken_and_Rabbit_Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of legs: ");
        int legs = sc.nextInt();
        System.out.print("Enter the heads: ");
        int heads = sc.nextInt();

        System.out.println("--- Valid Case ---");
        calculateAnimals(heads, legs);

        System.out.println("\n--- Invalid Cases ---");
        calculateAnimals(10, 50); // Too many legs
        calculateAnimals(10, 15); // Odd number of legs
        calculateAnimals(-5, 10); // Negative input
    }

    private static void calculateAnimals(int heads, int legs) {
        // 1. Check for negative inputs
        if (heads < 0 || legs < 0) {
            System.out.println("Invalid input: Heads and legs cannot be negative.");
            return;
        }

        // 2. Check if legs are odd (both chickens and rabbits have an even number of legs)
        if (legs % 2 != 0) {
            System.out.println("Invalid input: Total legs cannot be an odd number.");
            return;
        }

        // 3. Check physical boundaries (min 2 legs per animal, max 4 legs per animal)
        if (legs < 2 * heads || legs > 4 * heads) {
            System.out.println("Invalid input: The combination of heads and legs is physically impossible.");
            return;
        }

        // 4. Calculate counts using the mathematical formula
        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        // 5. Output the valid result
        System.out.println("Chickens: " + chickens);
        System.out.println("Rabbits: " + rabbits);
    }
}
