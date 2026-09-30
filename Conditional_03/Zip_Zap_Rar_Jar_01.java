package Conditional_03;

import java.util.Scanner;

public class Zip_Zap_Rar_Jar_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        sc.close();

        // If-Else Condition Apply
        if (firstNumber % 5 == 0 && firstNumber % 3 == 0){
            System.out.println("Rar because divisible by both");
        } else if (firstNumber % 5 == 0) {
            System.out.println("ZAP because divisible by 5");
        } else if (firstNumber % 3 == 0) {
            System.out.println("ZIP because divisible by 3");
        }else {
            System.out.println("Jar because no divisible by 3,5 and both");
        }
    }
}
