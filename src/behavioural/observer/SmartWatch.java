package behavioural.observer;

public class SmartWatch implements ObserverInterface{
    @Override
    public void update(float temperature) {
        System.out.println("Temperature received on smartWatch "+ temperature);
    }
}
