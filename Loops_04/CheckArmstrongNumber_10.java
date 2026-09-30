package Loops_04;

import java.util.Scanner;

public class CheckArmstrongNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        boolean flag = isArmstrong(number);
        if (flag) {
            System.out.println("The number " + number + " is an Armstrong number");
        } else {
            System.out.println("The number " + number + " is not an Armstrong number");
        }
        sc.close();
    }

    private static boolean isArmstrong(int number) {
        String str = String.valueOf(number);
        int count = str.length();

        int sum = 0;
        int temp = number;

        while ( temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit,count);
            temp = temp / 10;
        }

        if(sum == number)
            return true;
        else
            return false;
    }
}

