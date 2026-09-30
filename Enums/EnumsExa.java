package Enums;
public class EnumsExa {

    enum Weekdays{
        Monday,Tuesday,Wednesday,Thursday,Friday;
    }

    enum weekend{
        Saturday,Sunday;
    }

    public static void main(String[] args) {

        // This is for all values
        Course[] course = Course.values();

        for (Course c : course){
            System.out.println(c);
        }


        // This is for single Value
        Course Java = Course.Java;
        System.out.println(Java);
    }
}



/*
What is Enum :
  Enum introduced in java 1.5 version
  Enum is a special data type in java
  Enum data type is used to create Constants
  To declare constants using Enum we will use "enum" keyword
  Enum stands for Enumeration


  * IMP --> When we want to declare pre-defined constants then we will use Enums concept.

            =======================================
 Most Imp   Few points to remember related to Enums
            ========================================
            1. Enum constants we can't override
            2. Enum doesn't support object creation
            3. Enum can't extend classes

 */