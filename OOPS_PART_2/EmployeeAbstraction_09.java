package OOPS_PART_2;

public abstract class EmployeeAbstraction_09 {
    abstract double calculateSalary();
    abstract void displayEmployee();
}

class FullTimeEmployee extends EmployeeAbstraction_09{

    double baseSalary;
    int currentYear;

    @Override
    double calculateSalary() {
        return baseSalary * Math.pow(1 + 0.10, currentYear - 1);
    }


    @Override
    void displayEmployee() {
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Current year: "+currentYear);
        System.out.println("Increment every Year: "+ 10+"%");
        System.out.println("Final salary: "+calculateSalary());
    }
}

class PartTimeEmployee extends EmployeeAbstraction_09{

    double dailyHr;
    int workingDays;

    @Override
    double calculateSalary() {
        double monthlyHr = dailyHr * workingDays;
        return monthlyHr * 100;
    }


    @Override
    void displayEmployee() {
        System.out.println("Daily Hours: "+dailyHr);
        System.out.println("Working days: "+workingDays);
        System.out.println("Total Monthly salary: "+calculateSalary());
    }
}