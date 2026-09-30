package OOPS_PART_2;

public class StudentMarks_03 {
    private double marks;

    public StudentMarks_03(double marks) {
        setMarks(marks);
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100){
            this.marks = marks;
        }else {
            System.out.println("Error: Invalid marks ("+ marks + "). Must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        StudentMarks_03 st = new StudentMarks_03(96);
        System.out.println("Student 1 Marks: " + st.getMarks());
    }
}
