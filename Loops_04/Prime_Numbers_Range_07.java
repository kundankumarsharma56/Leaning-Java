package Loops_04;

import java.util.Scanner;

public class Prime_Numbers_Range_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first range: ");
        int firstRange = sc.nextInt();
        System.out.print("Enter last range: ");
        int lastRange = sc.nextInt();
        sc.close();


        if (firstRange > lastRange || lastRange < 2) {
            System.out.println("Invalid range.");
            return;
        }

        //  Adjust starting range since numbers less than 2 are not prime
        if (firstRange < 2) {
            firstRange = 2;
        }


        for (int i = firstRange; i <= lastRange; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
