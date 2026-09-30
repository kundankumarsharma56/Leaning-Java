package String_07.Basic01;

import java.util.Scanner;

public class Count_Vowels_And_Consonants_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        
        Count_Consonants(str);
    }

    private static void Count_Consonants(String str) {
        char[] consonants = str.toCharArray();
        int count = 0;
        int vowels = 0;
        int i = 0;
        while (i < str.length()){
            char counting =  consonants[i];
            if(counting != 'a' && counting != 'e' && counting != 'i' && counting != 'o' && counting != 'u'){
                count++;
            }else {
                vowels++;
            }
            i++;
        }

        System.out.println("Total number of vowels: "+vowels);
        System.out.println("Total number of consonants: "+count);
    }
}
