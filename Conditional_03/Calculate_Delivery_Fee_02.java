package Conditional_03;

import java.util.Scanner;

public class Calculate_Delivery_Fee_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in Km: ");
        double km = sc.nextDouble();
        if (km < 0)
            return;

        if (km <= 3){
            System.out.println("Free Delivery: "+km);
        } else if (km > 3 && km <= 6) {
            double Amount = (6 * km) - 18;
            System.out.println("Delivery fee: "+Amount);
        } else if (km > 6) {
            double AmountOfRemaining = ((12 * km) - 36) - 18;
            System.out.println("Delivery fee: "+ AmountOfRemaining);
        }
    }
}
