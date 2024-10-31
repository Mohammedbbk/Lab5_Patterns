package adapter.payment;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment(100.00);
    }
}