package Payment_02;

public class DebitCardPayment implements IPayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Debit Card payment Process...");

        return true;
    }
}
