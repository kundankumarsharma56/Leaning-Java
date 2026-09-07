package String_07.Easy02;

import java.util.Scanner;

public class PalindromeString_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for reverse: ");
        String str = sc.next();

        boolean re = ReverseStringToCheckPalindrome(str);

        if (re){
            System.out.println("Reverse String is yes Palindrome: "+ true);
        }else{
            System.out.println("Reverse String is not Palindrome: "+ false);
        }

    }

    private static boolean ReverseStringToCheckPalindrome(String str) {
        char[] st = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            char rev = st[left];
            st[left] = st[right];
            st[right] = rev;

            left++;
            right--;

        }
        String reverse = new String(st);
        return reverse.equals(str);
    }
}
