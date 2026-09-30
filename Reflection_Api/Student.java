package Reflection_Api;

public class Student {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    public void display(){
        System.out.println("Student id: "+id);
    }

    public void displayDeatils(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student email: "+email);
    }

    public void displayDeatilsWithPhone(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student email: "+email);
        System.out.println("Student Phone: "+phoneNumber);
    }
}
