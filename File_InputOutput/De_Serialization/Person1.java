package File_InputOutput.De_Serialization;

import File_InputOutput.Serialization.Person;
import java.io.*;


public class Person1 {
    public static void main(String[] args) throws Exception {

        System.out.println("=== De-Serialization Started ===");

            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();

            Person p2 = (Person) object;

            System.out.println("ID   : " + p2.id);
            System.out.println("Name : " + p2.name);
            System.out.println("Email : " + p2.email);
            System.out.println("Password : "+ p2.password);
            ois.close();

        System.out.println("=== De-Serialization Completed ===");
    }
}