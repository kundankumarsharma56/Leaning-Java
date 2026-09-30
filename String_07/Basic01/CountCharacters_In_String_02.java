package String_07.Basic01;

import java.util.Scanner;

public class CountCharacters_In_String_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String srt = sc.nextLine();

        CountCharacters(srt);
    }

    private static void CountCharacters(String srt) {
        char st[] = srt.toCharArray();
        int count = 0;
        int i = 0;
        while (i < srt.length()){
           char counting =  st[i];
           if (counting == st[i])
               count++;
           i++;
        }
        System.out.println("Total Number of Character: "+count);
    }
}
