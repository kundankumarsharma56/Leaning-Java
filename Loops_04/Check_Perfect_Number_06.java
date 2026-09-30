package Loops_04;

import java.util.Scanner;

public class Check_Perfect_Number_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean flag = isPerfect(num);
        sc.close();

        if (flag){
            System.out.println("It's Perfect number: "+num);
        }else {
            System.out.println("It's not perfect number: "+num);
        }
    }

    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
