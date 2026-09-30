package OOPS_PART_1;

public class StudentClass_01 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Aman Sharma";
        st.age = 21;
        st.course = "Computer Science and Engineering";

        Student st1 = new Student();
        st1.name = "Laxmi Kumari";
        st1.age = 18;
        st1.course = "BA";

        Student st2 = new Student();
        st2.name = "Suman Kumar";
        st2.age = 25;
        st2.course = "Java backend Developer";

        // Print all 3 Student data
        System.out.println("========= 1 Student =========");
        st.displayDetailsOfStudent();
        System.out.println("========= 2 Student =========");
        st1.displayDetailsOfStudent();
        System.out.println("========= 3 Student =========");
        st2.displayDetailsOfStudent();
    }
}

class Student{
    String name;
    int age;
    String course;

    void displayDetailsOfStudent(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Course: "+course);
    }
}
