package Payment_02;

public class CreditCardPayment implements IPayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Credit Card payment Process...");
        return true;
    }
}
