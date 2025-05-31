package behavioural.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment(int amount) {
        System.out.println("process payment via CreditCard for amount : " + amount);
    }
}
