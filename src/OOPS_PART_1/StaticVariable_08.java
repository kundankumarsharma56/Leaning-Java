package OOPS_PART_1;

public class StaticVariable_08 {
   int id;
   String name;
   double salary;

   static  String staticVariable = "ABC_Company";

    public StaticVariable_08(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void deisplayDeatils(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Company Name: "+staticVariable);
    }
    public static void main(String[] args) {
        StaticVariable_08 stt = new StaticVariable_08(101,"Suraj",85000);
        stt.deisplayDeatils();

        StaticVariable_08 stt1 = new StaticVariable_08(1004,"Anjali",65000);
               stt1.deisplayDeatils();

        StaticVariable_08 stt2 = new StaticVariable_08(100005,"Indu",90000);
                  stt2.deisplayDeatils();
    }
}
