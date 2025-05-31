package behavioural.strategy;

public class RunStartegy {
    public void run() {
        PaymentService payService = new PaymentService();
        payService.setPaymentStrategy(new CreditCard());
        payService.pay(75650);
    }
}
