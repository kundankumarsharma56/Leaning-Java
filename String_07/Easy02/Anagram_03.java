package String_07.Easy02;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");

        String srt1 = sc.nextLine();

        System.out.print("Enter the second String: ");

        String srt2 = sc.nextLine();

        Anagram(srt1,srt2);
    }

    private static void Anagram(String srt1, String srt2) {
        char []s1 = srt1.toCharArray();
        char []s2 = srt2.toCharArray();


        Arrays.sort(s1);
        Arrays.sort(s2);


//        String ana = new String(s1);
//        String an = new String(s2);

        if (Arrays.equals(s1, s2))
            System.out.println("yup this Anagram: "+s1);
        else
            System.out.println("Nope this is not Anagram: "+s2);
    }
}
