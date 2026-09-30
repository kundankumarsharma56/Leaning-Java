package Generics;

public class ExampleOfgenerics<T> {

    public void m1(T args){
        System.out.println("This is Instance method :"+args);
    }

    public static void main(String[] args) {
        ExampleOfgenerics exampleOfgenerics = new ExampleOfgenerics();
        exampleOfgenerics.m1(100);  // This is integer type
        exampleOfgenerics.m1("Hello"); // This is string Types
        exampleOfgenerics.m1(12520.656);  // This is Double Types
    }
}


