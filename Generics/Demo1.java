package Generics;

import java.util.Scanner;

public class Demo1 <T , T1>{

    T object;
    T1 object1;

    Demo1(T object,T1 object1){
        this.object = object;
        this.object1 = object1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // This is only for sum of two number using Generics
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        Demo1<Integer , Integer> add = new Demo1<>(firstNumber,secondNumber);
        int result = add.object + add.object1;
        System.out.println("Sum of two number: "+result);

        // This is only for Name concatenation using Generics
        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();

        Demo1<String , String > Sum_ofName = new Demo1<>(firstName,lastName);
        String Name = Sum_ofName.object + Sum_ofName.object1;
        System.out.println("Name concatenation using Generics: "+Name);

    }
}
