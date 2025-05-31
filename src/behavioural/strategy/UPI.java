package behavioural.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment(int amount) {
        System.out.println("Process payment via UPI for amount : "+amount);
    }
}
