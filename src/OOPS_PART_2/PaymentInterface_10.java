package OOPS_PART_2;

public interface PaymentInterface_10 {
    public void pay(double amount);
}

class UPI implements PaymentInterface_10{

    @Override
    public void pay(double amount) {
        System.out.println("Pay using UPI: "+amount);
    }
}

class CreditCard implements PaymentInterface_10{
    @Override
    public void pay(double amount) {
        System.out.println("Pay using CreditCard: "+amount);
    }
}

class NetBanking implements PaymentInterface_10{
    @Override
    public void pay(double amount) {
        System.out.println("Pay using NetBanking: "+amount);
    }
}