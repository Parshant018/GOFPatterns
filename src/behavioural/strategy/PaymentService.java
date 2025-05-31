package behavioural.strategy;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        this.paymentStrategy.processPayment(amount);
    }
}
