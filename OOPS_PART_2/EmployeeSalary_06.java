package OOPS_PART_2;

public class EmployeeSalary_06 {
    public double calculateSalary(double monthlyPay){
        return monthlyPay * 12;
    }

    public static void main(String[] args) {
       EmployeeSalary_06 emp1 = new Manager();
       System.out.println("Salary is: "+emp1.calculateSalary(6500));

       EmployeeSalary_06 dev = new Developer();
       System.out.println("Salary is: "+dev.calculateSalary(13000));
    }
}

class Manager extends EmployeeSalary_06{
    @Override
    public double calculateSalary(double monthly){
        return monthly * 12;
    }
}

class Developer extends EmployeeSalary_06{
    @Override
    public double calculateSalary(double monthly){
        return monthly * 12;
    }
}
