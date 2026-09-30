package OOPS_PART_1;

public class Calculator_10 {

    double add(int a,int b){
        return a + b;
    }
    double add(int a,int b,int c){
        return a + b + c;
    }
    double add(double a,double b){
        return a + b;
    }
    double add(double a,double b,double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator_10 calculator = new Calculator_10();
        System.out.println("Sum of number: "+calculator.add(4,6));
        System.out.println("Sum of number: "+calculator.add(4,6 , 8));
        System.out.println("Sum of number: "+calculator.add(4.36,6.48));
        System.out.println("Sum of number: "+calculator.add(4.95,6.34,9.78));

    }
}
