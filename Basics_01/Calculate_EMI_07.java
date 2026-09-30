package Basics_01;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Calculate_EMI_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal_Amount = sc.nextDouble();
        System.out.println("Enter the rate Of Interest: ");
        double rate_Of_Interest = sc.nextDouble();
        double Interest = (rate_Of_Interest / 12 )/100;
        System.out.print("Enter the number of years: ");
        int year = sc.nextInt();

        int tenure = year * 12;
        Calculate(principal_Amount, Interest, tenure);
    }

    private static void Calculate(double principalAmount, double Interest, int tenure) {
        double EMI = (principalAmount * Interest * pow(1 + Interest,tenure)) / (pow(1 + Interest,tenure) -1);

        // Output Print
        System.out.println("Monthly Emi: "+EMI);
        double Total_Amount_Repayable = EMI * tenure;
        System.out.println("Total Amount Repayable: "+Total_Amount_Repayable);
        double Total_Interest_Payable = Total_Amount_Repayable - principalAmount;
        System.out.println("Total Interest Payable: "+Total_Interest_Payable);
    }
}
