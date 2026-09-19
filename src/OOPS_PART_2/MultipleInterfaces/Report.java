package OOPS_PART_2.MultipleInterfaces;

public class Report implements Printable, Showable{

    @Override
    public void PrintableMethod() {
        System.out.println("This is Printable Method");
    }

    @Override
    public void ShowableMethod() {
        System.out.println("This is Showable Method");
    }

    public static void main(String[] args) {
        Report r = new Report();
        r.PrintableMethod();
        r.ShowableMethod();
    }
}

