package Reflection_Api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CallingClass {
    public static void main(String[] args) throws Exception {

        Class class1 = Class.forName("Reflection_Api.Student");

        System.out.println("========Variables========");
        Field[] fields = class1.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName());
        }

        System.out.println("========Methods========");
        Method[] method1 = class1.getDeclaredMethods();
        for (Method m : method1){
            System.out.println(m.getName());
        }

        System.out.println("========Constructors========");
        Constructor[] constructors = class1.getDeclaredConstructors();
        for (Constructor c : constructors){
            System.out.println(c.getName());
        }
    }
}
