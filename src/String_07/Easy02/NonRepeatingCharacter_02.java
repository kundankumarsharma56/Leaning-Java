package String_07.Easy02;

import java.util.Scanner;

public class NonRepeatingCharacter_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        char Character = NonRepeatingCharacter(string);
        if (true)
            System.out.println(Character);
        else
            System.out.println("$");
    }

    private static char NonRepeatingCharacter(String string) {

        char[] characters = string.toCharArray();
        for (char c : characters) {
            int count = 0;
            for (char character : characters) {
                if (c == character) {
                    count++;
                    c = character;
                }
            }
            if (count == 1) {
                return c;
            }
        }
        return '$';
    }
}
