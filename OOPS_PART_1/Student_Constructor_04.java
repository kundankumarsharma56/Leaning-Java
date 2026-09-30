package OOPS_PART_1;

public class Student_Constructor_04 {
    String name;
    int rollNo;
    double marks;

    public Student_Constructor_04(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayData(){
        System.out.println("name: "+name+" - Roll number: "+rollNo+" - marks: "+marks);
    }

    public static void main(String[] args) {
        Student_Constructor_04 student = new Student_Constructor_04("Aman",1001,96);
        Student_Constructor_04 student1 = new Student_Constructor_04("Suraj",1002,87.93);
        Student_Constructor_04 student2 = new Student_Constructor_04("Puja",10004,65.6);

        student.displayData();
        student1.displayData();
        student2.displayData();
    }
}
