package Conditional_03;
import java.util.Scanner;

public class Convert_Paise_Amount_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paisa: ");
        int paisa = sc.nextInt();

        int rs = paisa / 100;
        paisa %= 100;

        int p50 = paisa / 50;
        paisa %= 50;

        int p20 = paisa / 20;
        paisa %= 20;

        int p10 = paisa / 10;
        paisa %= 10;

        int p1 = paisa / 1;

        sc.close();



        // Print results
        System.out.println("Rupees: " + rs);
        System.out.println("50 Paise: " + p50);
        System.out.println("20 Paise: " + p20);
        System.out.println("10 Paise: " + p10);
        System.out.println("1 Paise: " + p1);
    }
}
