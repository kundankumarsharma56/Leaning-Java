package Loops_04;

import java.util.Scanner;

public class Convert_Number_Into_Words_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        String str = numberToWords(number);
        System.out.println(str);
        sc.close();
    }

    private static String numberToWords(int number) {
        String str = "";
        while (number > 0){
            int digit = number % 10;
            number /= 10;
            switch (digit) {
                case 0:
                    str = "ZERO " + str;
                    break;
                case 1:
                    str = "ONE " + str;
                    break;
                case 2:
                    str = "TWO " + str;
                    break;
                case 3:
                    str = "THREE " + str;
                    break;
                case 4:
                    str = "FOUR " + str;
                    break;
                case 5:
                    str = "FIVE " + str;
                    break;
                case 6:
                    str = "SIX " + str;
                    break;
                case 7:
                    str = "SEVEN " + str;
                    break;
                case 8:
                    str = "EIGHT " + str;
                    break;
                case 9:
                    str = "NINE " + str;
                    break;
            }
        }
        return str;
    }
}
