package OOPS_PART_1;

public class Employee_02 {
    int id;
    String name;
    double salary;

    void displayDetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }

    public static void main(String[] args) {
        System.out.println("========= 1 Employee =========");
        Employee_02 emp = new Employee_02();
        emp.id = 101;
        emp.name = "Sunita Sharma";
        emp.salary = 25000;
        emp.displayDetails();

        System.out.println("========= 2 Employee =========");
        Employee_02 emp1 = new Employee_02();
        emp1.id = 102;
        emp1.name = "Ankit ";
        emp1.salary = 45000;
        emp1.displayDetails();

        System.out.println("========= 2 Employee =========");
        Employee_02 emp2 = new Employee_02();
        emp2.id = 103;
        emp2.name = "Rahul Thakur";
        emp2.salary = 18000;
        emp2.displayDetails();
    }
}
