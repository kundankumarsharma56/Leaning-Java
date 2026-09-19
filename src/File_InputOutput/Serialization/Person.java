package File_InputOutput.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
    // This is final serialVersionUID not change after re-compile
    private  static  final long serialVersionUID = 100000321l;

    public int id;
    public String name;
    public String email;
    public transient String password;  // Transient is not participate in Serializable this is for sensitive data


    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.id = 100;
        p1.name = "Raju";
        p1.email = "raju123@gmail.com";
        p1.password = "Raju@123";

        System.out.println("=== Serialization Started ===");
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            oss.writeObject(p1);
            oss.flush();
            oss.close();

        System.out.println("=== Serialization Completed ===");

    }
}
