package ExceptionHandling;

public class toString {
    private String name;
    private int rollNumber;
    private String department;

    public toString(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", Roll Number: " + rollNumber + ", Department: " + department + "]";
    }

    public static void main(String[] args) {
        toString student = new toString("Amit Sharma", 101, "Computer Science");
        System.out.println(student);
    }
}

