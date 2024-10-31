package adapter.payment;

public class PayPalGateway {
    public void sendPayment(String amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

