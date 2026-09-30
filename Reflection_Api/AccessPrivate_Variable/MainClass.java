package Reflection_Api.AccessPrivate_Variable;

import java.lang.reflect.Field;

public class MainClass {
    public static void main(String[] args) throws Exception{

        // Loading class into Jvm
        Class clas = Class.forName("Reflection_Api.AccessPrivate_Variable.PrivateClassForEx");

        // Creating object for the loaded class
        Object object = clas.newInstance();

        // Getting the filed & filed1 whose name is id and Name
        Field field = clas.getDeclaredField("id");
        Field field1 = clas.getDeclaredField("name");

        // Making variable accessible outside the class
        field.setAccessible(true);
        field1.setAccessible(true);

        // set values to field and field1
        field.set(object,1001);
        field1.set(object,"Aman");

        PrivateClassForEx privateClassForEx = (PrivateClassForEx) object;

        // Calling methods
        privateClassForEx.DisplayDeatils();

    }
}
