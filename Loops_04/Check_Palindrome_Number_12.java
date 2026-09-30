package Loops_04;

import java.util.Scanner;

public class Check_Palindrome_Number_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        // created method
        boolean flag = isPalindrome(number);

        // print if true or not
        if (flag){
            System.out.print("Yes, it's palindrome number: "+number);
        }else {
            System.out.print("No, it's not palindrome number: "+number);
        }
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0){
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;
        }

        // check after reverse palindrome
        if (number == reverse){
            return true;
        }else {
            return false;
        }
    }
}
