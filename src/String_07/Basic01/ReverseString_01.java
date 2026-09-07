package String_07.Basic01;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for reverse: ");
        String str = sc.next();

         ReverseString(str);

    }

    private static void ReverseString(String str) {
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
        System.out.println("Reverse String: "+reverse);
    }
}


