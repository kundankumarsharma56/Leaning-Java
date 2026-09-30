package OOPS_PART_2;

public abstract class  PaymentSystem_08 {
    abstract void pay(double amount);
}

class CreditCardPayment extends PaymentSystem_08{

    @Override
    void pay(double amount) {
        System.out.println("Pay via Credit Card"+amount);
    }
}

class UPIPayment extends PaymentSystem_08{

    @Override
    void pay(double amount) {
        System.out.println("Pay via UPIPayment"+amount);
    }
}

class CashPayment extends PaymentSystem_08{

    @Override
    void pay(double amount) {
        System.out.println("Pay via Cash Payment"+amount);
    }
}