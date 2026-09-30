package Payment_02;

public class Main {
    public static void main(String[] args) {
        IPayment payment = new DebitCardPayment();
        PaymentService paymentService = new PaymentService(payment);
        paymentService.doPayment(2000);
    }
}
