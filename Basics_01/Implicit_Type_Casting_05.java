package Basics_01;

import java.util.Scanner;

public class Implicit_Type_Casting_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the int value: ");
        int integar = sc.nextInt();
        System.out.print("Enter the float: ");
        float floating = sc.nextFloat();


        // Sum of Both
        float finalValue = (float) integar + floating;
        System.out.println("Sum of both: "+finalValue);

        // Type casting never Loss data
        floating = integar;

        System.out.println("Int : " + integar + " is converted to Float : " + floating);
    }
}
