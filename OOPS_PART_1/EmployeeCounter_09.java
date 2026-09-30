package OOPS_PART_1;

public class EmployeeCounter_09 {
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }
    public EmployeeCounter_09() {
    }

    public EmployeeCounter_09(int n) {
    }

    public EmployeeCounter_09(String s) {
    }

    public static void main(String args[]) {
        EmployeeCounter_09 t1 = new EmployeeCounter_09();
        EmployeeCounter_09 t2 = new EmployeeCounter_09(3);
        EmployeeCounter_09 t3 = new EmployeeCounter_09("Aman");

        System.out.println("Total Employees: " +EmployeeCounter_09.noOfObjects);
    }
}
