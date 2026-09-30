package Payment_02;

public class SodexoPayment implements IPayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Sodexo payment Process...");
        return true;
    }
}
